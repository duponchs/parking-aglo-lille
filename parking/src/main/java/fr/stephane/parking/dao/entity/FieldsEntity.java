package fr.stephane.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import fr.stephane.parking.model.Geometry;

/**
 * classe publique entity
 */
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

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return nombre de place max
     */
    public Integer getNbPlaceMaxi() {
        return nbPlaceMaxi;
    }

    /**
     * @param nbPlaceMaxi
     */
    public void setNbPlaceMaxi(Integer nbPlaceMaxi) {
        this.nbPlaceMaxi = nbPlaceMaxi;
    }

    /**
     * @return nombre de place dispo
     */
    public Integer getNbPlaceDisponible() {
        return nbPlaceDisponible;
    }

    /**
     * @param nbPlaceDisponible
     */
    public void setNbPlaceDisponible(Integer nbPlaceDisponible) {
        this.nbPlaceDisponible = nbPlaceDisponible;
    }

    /**
     * @return geometry (coordonnées)
     */
    public Geometry getGeometry() {
        return geometry;
    }

    /**
     * @param geometry
     */
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * @return etat
     */
    public String getEtat() {
        return etat;
    }

    /**
     * @param etat
     */
    public void setEtat(String etat) {
        this.etat = etat;
    }

    /**
     * @return dateMaj
     */
    public String getDateMaj() {
        return dateMaj;
    }

    /**
     * @param dateMaj
     */
    public void setDateMaj(String dateMaj) {
        this.dateMaj = dateMaj;
    }
}
