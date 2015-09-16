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
@JsonPropertyOrder({ "@type", "@name", "value" })
public class Attribute {

	@JsonProperty("@type")
	private String Type;
	@JsonProperty("@name")
	private String Name;
	@JsonProperty("value")
	private String value;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The Type
	 */
	@JsonProperty("@type")
	public String getType() {
		return Type;
	}

	/**
	 * 
	 * @param Type
	 *            The @type
	 */
	@JsonProperty("@type")
	public void setType(String Type) {
		this.Type = Type;
	}

	/**
	 * 
	 * @return The Name
	 */
	@JsonProperty("@name")
	public String getName() {
		return Name;
	}

	/**
	 * 
	 * @param Name
	 *            The @name
	 */
	@JsonProperty("@name")
	public void setName(String Name) {
		this.Name = Name;
	}

	/**
	 * 
	 * @return The value
	 */
	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	/**
	 * 
	 * @param value
	 *            The value
	 */
	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
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
		return new HashCodeBuilder().append(Type).append(Name).append(value).append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Attribute) == false) {
			return false;
		}
		Attribute rhs = ((Attribute) other);
		return new EqualsBuilder().append(Type, rhs.Type).append(Name, rhs.Name).append(value, rhs.value)
				.append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}