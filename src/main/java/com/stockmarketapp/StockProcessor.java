package com.stockmarketapp;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;


//Uses CompletableFuture to process data asynchronously.
public class StockProcessor {
	
	public static CompletableFuture<Double> processStockPrice(Future<Double> futurePrice){
		return CompletableFuture.supplyAsync(()->{
			try {
				Double price = futurePrice.get();
				return Math.round(price * 100.0)/100.0;
			} catch (Exception e) {
				// TODO: handle exception
				throw new RuntimeException(e);
			}
		});
	}

}
