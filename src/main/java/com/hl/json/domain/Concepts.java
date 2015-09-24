package com.hl.json.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "@code", "description", "attributes", "validityDateRanges" })
public class Concepts {

	@JsonProperty("@code")
	private String code;
	@JsonProperty("description")
	private String description;
	@JsonProperty("attributes")
	@Valid
	private List<Attribute> attributes;
	@JsonProperty("validityDateRanges")
	@Valid
	private ValidityDateRanges validityDateRanges;
	@JsonIgnore
	private Map<String, Attribute> additionalProperties = new HashMap<String, Attribute>();

	/**
	 * 
	 * @return The Code
	 */
	@JsonProperty("@code")
	public String getCode() {
		return code;
	}

	/**
	 * 
	 * @param Code
	 *            The @code
	 */
	@JsonProperty("@code")
	public void setCode(String Code) {
		this.code = Code;
	}

	/**
	 * 
	 * @return The description
	 */
	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *            The description
	 */
	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return The attributes
	 */
	@JsonProperty("attributes")
	public List<Attribute> getAttributes() {
		return attributes;
	}

	/**
	 * 
	 * @param attributes
	 *            The attributes
	 */
	@JsonProperty("attributes")
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	/**
	 * 
	 * @return The validityDateRanges
	 */
	@JsonProperty("validityDateRanges")
	public ValidityDateRanges getValidityDateRanges() {
		return validityDateRanges;
	}

	/**
	 * 
	 * @param validityDateRanges
	 *            The validityDateRanges
	 */
	@JsonProperty("validityDateRanges")
	public void setValidityDateRanges(ValidityDateRanges validityDateRanges) {
		this.validityDateRanges = validityDateRanges;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Attribute> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Attribute value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(code).append(description).append(attributes).append(validityDateRanges)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Concepts) == false) {
			return false;
		}
		Concepts rhs = ((Concepts) other);
		return new EqualsBuilder().append(code, rhs.code).append(description, rhs.description)
				.append(attributes, rhs.attributes).append(validityDateRanges, rhs.validityDateRanges)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}