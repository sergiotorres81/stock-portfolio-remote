package com.st.remote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.remote.domain.internal.ResourceDto;
import com.st.remote.domain.markit.Stock;
import com.st.remote.service.StockService;

@RestController
public class StockRestController {

	@Autowired
	private StockService stockService;

	@RequestMapping("/ticker/{ticker}")
	public Stock findStockByTicker(@PathVariable String ticker) {
		return stockService.findStockByTicker(ticker);
	}

	@RequestMapping("/market/{market}/ticker/{ticker}")
	public ResourceDto findStockByTickerAndMarket(@PathVariable String market, @PathVariable String ticker) {
		return stockService.findStockByTickerAndMarket(market, ticker);
	}

}
