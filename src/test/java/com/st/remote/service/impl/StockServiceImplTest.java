package com.st.remote.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.st.remote.StockPortolioRemoteApplication;
import com.st.remote.domain.internal.FieldsDto;
import com.st.remote.domain.internal.ResourceDto;
import com.st.remote.domain.internal.StockDto;
import com.st.remote.domain.markit.Stock;
import com.st.remote.service.StockService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StockPortolioRemoteApplication.class)
@WebAppConfiguration
public class StockServiceImplTest {

	@Autowired
	private StockService stockService;


	@Test
	public void testFindStockByTicker() {
		System.out.println("testFindStockByTicker");
		Stock stock = createStockForMarkit();
		StockDto remote = stockService.findStockByTicker("MCD");
		assertEquals(stock.getSymbol(), remote.getSymbol());
		assertEquals(stock.getStatus(), remote.getStatus());
		assertEquals(stock.getName(), remote.getName());
	}

	private Stock createStockForMarkit() {
		// this should come in the json response associated to MCD symbol
		// "Status":"SUCCESS","Name":"McDonald's Corp","Symbol":"MCD"
		Stock stock = new Stock();
		stock.setSymbol("MCD");
		stock.setStatus("SUCCESS");
		stock.setName("McDonald's Corp");
		return stock;
	}

	// @Test
	public void testFindStockByTickerAndMarket() {
		ResourceDto localResource = createResourceForYahoo();
		ResourceDto remoteResource = stockService.findStockByTickerAndMarket("NYSE", "MCD");
		assertEquals(localResource.getType(), remoteResource.getType());
	}

	private ResourceDto createResourceForYahoo() {
		ResourceDto resource = new ResourceDto();
		resource.setType("Quote");
		FieldsDto fields = new FieldsDto();
		fields.setName("McDonald's Corp.");
		fields.setSymbol("MCD");
		resource.setFields(fields);
		return resource;
	}

}
