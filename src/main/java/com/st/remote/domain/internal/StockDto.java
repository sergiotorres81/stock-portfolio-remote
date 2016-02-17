package com.st.remote.domain.internal;

public class StockDto {

	private String status;
	private String name;
	private String symbol;
	private Double lastPrice;
	private Double change;
	private Double changePercent;
	private String timestamp;
	private Integer mSDate;
	private Long marketCap;
	private Integer volume;
	private Double changeYTD;
	private Double changePercentYTD;
	private Double high;
	private Double low;
	private Integer open;

	public StockDto() {
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(Double lastPrice) {
		this.lastPrice = lastPrice;
	}

	public Double getChange() {
		return change;
	}

	public void setChange(Double change) {
		this.change = change;
	}

	public Double getChangePercent() {
		return changePercent;
	}

	public void setChangePercent(Double changePercent) {
		this.changePercent = changePercent;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getmSDate() {
		return mSDate;
	}

	public void setmSDate(Integer mSDate) {
		this.mSDate = mSDate;
	}

	public Long getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(Long marketCap) {
		this.marketCap = marketCap;
	}

	public Integer getVolume() {
		return volume;
	}

	public void setVolume(Integer volume) {
		this.volume = volume;
	}

	public Double getChangeYTD() {
		return changeYTD;
	}

	public void setChangeYTD(Double changeYTD) {
		this.changeYTD = changeYTD;
	}

	public Double getChangePercentYTD() {
		return changePercentYTD;
	}

	public void setChangePercentYTD(Double changePercentYTD) {
		this.changePercentYTD = changePercentYTD;
	}

	public Double getHigh() {
		return high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public Double getLow() {
		return low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public Integer getOpen() {
		return open;
	}

	public void setOpen(Integer open) {
		this.open = open;
	}

}
