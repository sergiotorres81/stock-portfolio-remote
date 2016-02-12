package com.st.remote.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.st.remote.domain.internal.ResourceDto;
import com.st.remote.domain.markit.Stock;
import com.st.remote.domain.yahoo.ResourceElement;
import com.st.remote.domain.yahoo.YahooResource;
import com.st.remote.service.StockService;


@Service
public class StockServiceImpl implements StockService {

	@Autowired
	private ResourceMapper mapper;

	private static final String NYSE = "NYSE";

	private static final String URL_MARKIT_ON_DEMAND = "http://dev.markitondemand.com/Api/v2/Quote/json";
	private static final String URL_YAHOO_WEB_SERVICE = "http://finance.yahoo.com/webservice/v1/symbols/{symbol}/quote";

	private RestOperations restTemplate = new RestTemplate();

	@Override
	public Stock findStockByTicker(String ticker) {
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL_MARKIT_ON_DEMAND).queryParam("symbol",
				ticker);

		HttpEntity<?> entity = new HttpEntity<>(headers);

		HttpEntity<Stock> response = restTemplate.exchange(builder.build().encode().toUri(), HttpMethod.GET, entity,
				Stock.class);

		return response.getBody();
	}

	@Override
	public ResourceDto findStockByTickerAndMarket(String market, String ticker) {
		ResourceDto resource = new ResourceDto();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(URL_YAHOO_WEB_SERVICE).queryParam("format",
				"json");
		builder.queryParam("view", "detail");
		UriComponents uriComponents = null;
		if (market.equals(NYSE)) {
			uriComponents = builder.buildAndExpand(ticker);
		} else {
			uriComponents = builder.buildAndExpand(ticker + "." + market);
		}

		HttpEntity<?> entity = new HttpEntity<>(headers);
		
		HttpEntity<YahooResource> response = restTemplate.exchange(uriComponents.toUri(), HttpMethod.GET, entity,
				YahooResource.class);
		YahooResource yahooResource = response.getBody();
		if (!CollectionUtils.sizeIsEmpty(yahooResource.getList().getResources())) {
			List<ResourceElement> resourceList = Arrays.asList(yahooResource.getList().getResources());
			mapper.map(resourceList.get(0).getResource(), resource);
		}
		return resource;
	}


}
