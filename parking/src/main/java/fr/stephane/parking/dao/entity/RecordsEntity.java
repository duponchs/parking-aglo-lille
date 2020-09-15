package fr.stephane.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecordsEntity {
    @JsonProperty(value = "fields")
    private FieldsEntity fields;

    public FieldsEntity getFields() {
        return fields;
    }

    public void setFields(FieldsEntity fields) {
        this.fields = fields;
    }
}
