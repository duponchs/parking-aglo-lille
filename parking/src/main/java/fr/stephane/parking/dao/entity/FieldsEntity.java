package fr.stephane.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.stephane.parking.model.Geometry;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldsEntity {
    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "ville")
    private String ville;
    @JsonProperty(value = "libelle")
    private String libelle;
    @JsonProperty(value = "max")
    private Integer nbPlaceMaxi;
    @JsonProperty(value = "dispo")
    private Integer nbPlaceDisponible;
    @JsonProperty(value = "geometry")
    private Geometry geometry;
    @JsonProperty(value = "etat")
    private String etat; //statut
    @JsonProperty(value = "datemaj")
    private String dateMaj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Integer getNbPlaceMaxi() {
        return nbPlaceMaxi;
    }

    public void setNbPlaceMaxi(Integer nbPlaceMaxi) {
        this.nbPlaceMaxi = nbPlaceMaxi;
    }

    public Integer getNbPlaceDisponible() {
        return nbPlaceDisponible;
    }

    public void setNbPlaceDisponible(Integer nbPlaceDisponible) {
        this.nbPlaceDisponible = nbPlaceDisponible;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDateMaj() {
        return dateMaj;
    }

    public void setDateMaj(String dateMaj) {
        this.dateMaj = dateMaj;
    }
}
