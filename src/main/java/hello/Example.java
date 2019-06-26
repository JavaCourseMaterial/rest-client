package hello;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "content"
})
public class Example {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("content")
    private String content;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Example() {
    }

    /**
     *
     * @param content
     * @param id
     */
    public Example(Integer id, String content) {
        super();
        this.id = id;
        this.content = content;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Example withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public Example withContent(String content) {
        this.content = content;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Example withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Example example = (Example) o;
        return Objects.equals(id, example.id) &&
                Objects.equals(content, example.content) &&
                Objects.equals(additionalProperties, example.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content, additionalProperties);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Example{");
        sb.append("id=").append(id);
        sb.append(", content='").append(content).append('\'');
        sb.append(", additionalProperties=").append(additionalProperties);
        sb.append('}');
        return sb.toString();
    }
}
