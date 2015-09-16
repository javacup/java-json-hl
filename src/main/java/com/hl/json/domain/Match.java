package com.hl.json.domain;

import java.util.ArrayList;
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
@JsonPropertyOrder({ "match", "attributes", "codeSystemResults" })
public class Match {

	@JsonProperty("match")
	private String match;
	@JsonProperty("attributes")
	@Valid
	private List<Attribute> attributes = new ArrayList<Attribute>();
	@JsonProperty("codeSystemResults")
	@Valid
	private List<CodeSystemResults> codeSystemResults;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The match
	 */
	@JsonProperty("match")
	public String getMatch() {
		return match;
	}

	/**
	 * 
	 * @param match
	 *            The match
	 */
	@JsonProperty("match")
	public void setMatch(String match) {
		this.match = match;
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
	 * @return The codeSystemResults
	 */
	@JsonProperty("codeSystemResults")
	public List<CodeSystemResults> getCodeSystemResults() {
		return codeSystemResults;
	}

	/**
	 * 
	 * @param codeSystemResults
	 *            The codeSystemResults
	 */
	@JsonProperty("codeSystemResults")
	public void setCodeSystemResults(List<CodeSystemResults> codeSystemResults) {
		this.codeSystemResults = codeSystemResults;
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
		return new HashCodeBuilder().append(match).append(attributes).append(codeSystemResults)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Match) == false) {
			return false;
		}
		Match rhs = ((Match) other);
		return new EqualsBuilder().append(match, rhs.match).append(attributes, rhs.attributes)
				.append(codeSystemResults, rhs.codeSystemResults)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}