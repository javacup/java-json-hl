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
@JsonPropertyOrder({ "@codeSystem", "concepts", "attributes" })
public class CodeSystemResults {

	@JsonProperty("@codeSystem")
	private String codeSystem;
	@JsonProperty("concepts")
	@Valid
	private List<Concepts> concepts;
	@JsonProperty("attributes")
	@Valid
	private List<Attribute> attributes = new ArrayList<Attribute>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The CodeSystem
	 */
	@JsonProperty("@codeSystem")
	public String getCodeSystem() {
		return codeSystem;
	}

	/**
	 * 
	 * @param CodeSystem
	 *            The @codeSystem
	 */
	@JsonProperty("@codeSystem")
	public void setCodeSystem(String CodeSystem) {
		this.codeSystem = CodeSystem;
	}

	/**
	 * 
	 * @return The concepts
	 */
	@JsonProperty("concepts")
	public List<Concepts> getConcepts() {
		return concepts;
	}

	/**
	 * 
	 * @param concepts
	 *            The concepts
	 */
	@JsonProperty("concepts")
	public void setConcepts(List<Concepts> concepts) {
		this.concepts = concepts;
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
		return new HashCodeBuilder().append(codeSystem).append(concepts).append(attributes)
				.append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof CodeSystemResults) == false) {
			return false;
		}
		CodeSystemResults rhs = ((CodeSystemResults) other);
		return new EqualsBuilder().append(codeSystem, rhs.codeSystem).append(concepts, rhs.concepts)
				.append(attributes, rhs.attributes).append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}