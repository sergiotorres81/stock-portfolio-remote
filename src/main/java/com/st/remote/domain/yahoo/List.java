/* Generated by JavaFromJSON */
/*http://javafromjson.dashingrocket.com*/

package com.st.remote.domain.yahoo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class List {
	@JsonProperty("meta")
	private Meta meta;

 	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public Meta getMeta() {
		return meta;
	}

	@JsonProperty("resources")
	private ResourceElement[] resources;

 	public void setResources(ResourceElement[] resources) {
		this.resources = resources;
	}

	public ResourceElement[] getResources() {
		return resources;
	}

}