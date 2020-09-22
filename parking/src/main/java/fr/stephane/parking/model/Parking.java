package fr.stephane.parking.model;

/**
 * publique classe Parking
 */
public class Parking {
    private String id;
    private String nom;
    private Integer nbPlacesDispo;
    private Geometry geometry;
    private Integer nbPlacesTotal;
    private String statut;
    private String heureMaj;
    private String ville;

    /**
     * Constructeur vide
     */
    public Parking() {
    }

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
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return nombre de places dispo
     */
    public Integer getNbPlacesDispo() {
        return nbPlacesDispo;
    }

    /**
     * @param nbPlacesDispo
     */
    public void setNbPlacesDispo(Integer nbPlacesDispo) {
        this.nbPlacesDispo = nbPlacesDispo;
    }

    /**
     * @return geometry
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
     * @return nombre de place total
     */
    public Integer getNbPlacesTotal() {
        return nbPlacesTotal;
    }

    /**
     * @param nbPlacesTotal
     */
    public void setNbPlacesTotal(Integer nbPlacesTotal) {
        this.nbPlacesTotal = nbPlacesTotal;
    }

    /**
     * @return statut
     */
    public String getStatut() {
        return statut;
    }

    /**
     * @param statut
     */
    public void setStatut(String statut) {
        this.statut = statut;
    }

    /**
     * @return heureMaj
     */
    public String getHeureMaj() {
        return heureMaj;
    }

    /**
     * @param heureMaj
     */
    public void setHeureMaj(String heureMaj) {
        this.heureMaj = heureMaj;
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
}
