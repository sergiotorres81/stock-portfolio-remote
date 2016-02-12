package com.st.remote.domain.internal;

public class ResourceDto {

	private FieldsDto fields;

	private String type;

	/**
	 * @return the fields
	 */
	public FieldsDto getFields() {
		return fields;
	}

	/**
	 * @param fields
	 *            the fields to set
	 */
	public void setFields(FieldsDto fields) {
		this.fields = fields;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}
