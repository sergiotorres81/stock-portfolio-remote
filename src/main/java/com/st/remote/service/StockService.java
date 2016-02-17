package com.st.remote.service;

import com.st.remote.domain.internal.ResourceDto;
import com.st.remote.domain.internal.StockDto;

public interface StockService {

	/**
	 * This method will return infomation about an stock using MarkitonDemand.
	 * The URL will be: http://dev.markitondemand.com/Api/v2/Quote/json And the
	 * ticker is appended at the end. As an example, this would be the URL for
	 * Apple: http://dev.markitondemand.com/Api/v2/Quote/json?symbol=AAPL
	 * 
	 * @param ticker
	 * @return
	 */
	StockDto findStockByTicker(String ticker);

	/**
	 * This method will try to find a remote resource using Yahoo API
	 * The URL that will be used is: 
	 * http://finance.yahoo.com/webservice/v1/symbols/{symbol}/quote?format=json&view=detail
	 * where symbol is the ticket. But Yahoo needs more information if the stock is outside
	 * the US market.
	 * Then instead of the ticker alone you need to provide the market following
	 * the next pattern: TICKER.MARKET like in the example below:
	 * http://finance.yahoo.com/webservice/v1/symbols/ENG.MC/quote?format=json&view=detail
	 * 
	 * @param market
	 * @param ticker
	 * @return
	 */
	ResourceDto findStockByTickerAndMarket(String market, String ticker);

}
