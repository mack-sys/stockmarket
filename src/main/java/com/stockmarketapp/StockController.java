package com.stockmarketapp;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stocks")
public class StockController {

	@GetMapping("/{symbol}")
	public Double getStockPrice(@PathVariable String symbol) {
		Future<Double> 	futurePrice = StockPriceFetcher.fetchStockPrice(symbol);
		CompletableFuture<Double> processedPrice = StockProcessor.processStockPrice(futurePrice);
		
		processedPrice.thenAccept(price -> StockStorage.updateStockPrice(symbol, price));
		
		try {
			return processedPrice.get();
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Error fetching stock price",e);
		}
	}
}
