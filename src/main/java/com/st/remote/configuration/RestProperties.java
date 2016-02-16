package com.st.remote.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "rest")
public class RestProperties {

	private String urlMarketMarkitOnDemand;

	private String urlMareketYahooWebService;

	/**
	 * @return the urlMarketMarkitOnDemand
	 */
	public String getUrlMarketMarkitOnDemand() {
		return urlMarketMarkitOnDemand;
	}

	/**
	 * @param urlMarketMarkitOnDemand
	 *            the urlMarketMarkitOnDemand to set
	 */
	public void setUrlMarketMarkitOnDemand(String urlMarketMarkitOnDemand) {
		this.urlMarketMarkitOnDemand = urlMarketMarkitOnDemand;
	}

	/**
	 * @return the urlMareketYahooWebService
	 */
	public String getUrlMareketYahooWebService() {
		return urlMareketYahooWebService;
	}

	/**
	 * @param urlMareketYahooWebService
	 *            the urlMareketYahooWebService to set
	 */
	public void setUrlMareketYahooWebService(String urlMareketYahooWebService) {
		this.urlMareketYahooWebService = urlMareketYahooWebService;
	}

}
