package fr.stephane.parking.dao.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * classe publique ReponseAPIEntity
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReponseParkingAPIEntity{
    @JsonProperty(value = "records")
    private List<RecordsEntity> recors;

    /**
     * @return recors
     */
    public List<RecordsEntity> getRecors() {
        return recors;
    }

    /**
     * @param recors
     */
    public void setRecors(List<RecordsEntity> recors) {
        this.recors = recors;
    }
}
