package com.hl.json.domain;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
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
@JsonPropertyOrder({ "@startDate", "@endDate" })
public class ValidityDateRanges {

	@JsonProperty("@startDate")
	private String StartDate;
	@JsonProperty("@endDate")
	private String EndDate;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The StartDate
	 */
	@JsonProperty("@startDate")
	public String getStartDate() {
		return StartDate;
	}

	/**
	 * 
	 * @param StartDate
	 *            The @startDate
	 */
	@JsonProperty("@startDate")
	public void setStartDate(String StartDate) {
		this.StartDate = StartDate;
	}

	/**
	 * 
	 * @return The EndDate
	 */
	@JsonProperty("@endDate")
	public String getEndDate() {
		return EndDate;
	}

	/**
	 * 
	 * @param EndDate
	 *            The @endDate
	 */
	@JsonProperty("@endDate")
	public void setEndDate(String EndDate) {
		this.EndDate = EndDate;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(StartDate).append(EndDate).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ValidityDateRanges) == false) {
			return false;
		}
		ValidityDateRanges rhs = ((ValidityDateRanges) other);
		return new EqualsBuilder().append(StartDate, rhs.StartDate).append(EndDate, rhs.EndDate)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}