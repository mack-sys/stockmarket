package com.stockmarketapp;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Uses ExecutorService to fetch stock prices concurrently.
public class StockPriceFetcher {

	private static final ExecutorService executor = Executors.newFixedThreadPool(5);
	
	public static Future<Double> fetchStockPrice(String stockSymbol){
		return executor.submit(()->{
			Thread.sleep(1000);
			return Math.random() * 1000;
		});
	}
	
	public static void shutdown() {
		executor.shutdown();
	}
}
