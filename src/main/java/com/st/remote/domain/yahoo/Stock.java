package com.st.remote.domain.yahoo;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stock {

	@JsonProperty("Status")
	private String Status;
	@JsonProperty("Name")
	private String Name;
	@JsonProperty("Symbol")
	private String Symbol;
	@JsonProperty("LastPrice")
	private Double LastPrice;
	@JsonProperty("Change")
	private Double Change;
	@JsonProperty("ChangePercent")
	private Double ChangePercent;
	@JsonProperty("Timestamp")
	private String Timestamp;
	@JsonProperty("MSDate")
	private Integer MSDate;
	@JsonProperty("MarketCap")
	private Long MarketCap;
	@JsonProperty("Volume")
	private Integer Volume;
	@JsonProperty("ChangeYTD")
	private Double ChangeYTD;
	@JsonProperty("ChangePercentYTD")
	private Double ChangePercentYTD;
	@JsonProperty("High")
	private Double High;
	@JsonProperty("Low")
	private Double Low;
	@JsonProperty("Open")
	private Integer Open;

	public Stock() {

	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return Status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		Status = status;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the symbol
	 */
	public String getSymbol() {
		return Symbol;
	}

	/**
	 * @param symbol
	 *            the symbol to set
	 */
	public void setSymbol(String symbol) {
		Symbol = symbol;
	}

	/**
	 * @return the lastPrice
	 */
	public Double getLastPrice() {
		return LastPrice;
	}

	/**
	 * @param lastPrice
	 *            the lastPrice to set
	 */
	public void setLastPrice(Double lastPrice) {
		LastPrice = lastPrice;
	}

	/**
	 * @return the change
	 */
	public Double getChange() {
		return Change;
	}

	/**
	 * @param change
	 *            the change to set
	 */
	public void setChange(Double change) {
		Change = change;
	}

	/**
	 * @return the changePercent
	 */
	public Double getChangePercent() {
		return ChangePercent;
	}

	/**
	 * @param changePercent
	 *            the changePercent to set
	 */
	public void setChangePercent(Double changePercent) {
		ChangePercent = changePercent;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return Timestamp;
	}

	/**
	 * @param timestamp
	 *            the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		Timestamp = timestamp;
	}

	/**
	 * @return the mSDate
	 */
	public Integer getMSDate() {
		return MSDate;
	}

	/**
	 * @param mSDate
	 *            the mSDate to set
	 */
	public void setMSDate(Integer mSDate) {
		MSDate = mSDate;
	}

	/**
	 * @return the marketCap
	 */
	public Long getMarketCap() {
		return MarketCap;
	}

	/**
	 * @param marketCap
	 *            the marketCap to set
	 */
	public void setMarketCap(Long marketCap) {
		MarketCap = marketCap;
	}

	/**
	 * @return the volume
	 */
	public Integer getVolume() {
		return Volume;
	}

	/**
	 * @param volume
	 *            the volume to set
	 */
	public void setVolume(Integer volume) {
		Volume = volume;
	}

	/**
	 * @return the changeYTD
	 */
	public Double getChangeYTD() {
		return ChangeYTD;
	}

	/**
	 * @param changeYTD
	 *            the changeYTD to set
	 */
	public void setChangeYTD(Double changeYTD) {
		ChangeYTD = changeYTD;
	}

	/**
	 * @return the changePercentYTD
	 */
	public Double getChangePercentYTD() {
		return ChangePercentYTD;
	}

	/**
	 * @param changePercentYTD
	 *            the changePercentYTD to set
	 */
	public void setChangePercentYTD(Double changePercentYTD) {
		ChangePercentYTD = changePercentYTD;
	}

	/**
	 * @return the high
	 */
	public Double getHigh() {
		return High;
	}

	/**
	 * @param high
	 *            the high to set
	 */
	public void setHigh(Double high) {
		High = high;
	}

	/**
	 * @return the low
	 */
	public Double getLow() {
		return Low;
	}

	/**
	 * @param low
	 *            the low to set
	 */
	public void setLow(Double low) {
		Low = low;
	}

	/**
	 * @return the open
	 */
	public Integer getOpen() {
		return Open;
	}

	/**
	 * @param open
	 *            the open to set
	 */
	public void setOpen(Integer open) {
		Open = open;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
