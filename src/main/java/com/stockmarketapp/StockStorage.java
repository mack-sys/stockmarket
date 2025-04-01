package com.stockmarketapp;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StockStorage {
	private static final Map<String, Double> stockPrices = new ConcurrentHashMap<>();
	
	public static void updateStockPrice(String stockSymbol, Double price) {
		stockPrices.put(stockSymbol, price);
		
	}
	
	public static Double getStockPrice(String stockSymbol) {
		return stockPrices.getOrDefault(stockSymbol, 0.0);
	}

}
