package fr.stephane.parking.dao.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReponseParkingAPIEntity{
    @JsonProperty(value = "records")
    private List<RecordsEntity> recors;

    public List<RecordsEntity> getRecors() {
        return recors;
    }

    public void setRecors(List<RecordsEntity> recors) {
        this.recors = recors;
    }
}
