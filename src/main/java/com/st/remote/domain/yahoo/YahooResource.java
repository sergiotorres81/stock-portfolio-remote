/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.st.remote.domain.yahoo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class YahooResource {
	@JsonProperty("list")
	private List list;

 	public void setList(List list) {
		this.list = list;
	}

	public List getList() {
		return list;
	}

}