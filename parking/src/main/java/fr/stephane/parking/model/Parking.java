package fr.stephane.parking.model;

public class Parking {
    private String id;
    private String nom;
    private Integer nbPlacesDispo;
    private Integer nbPlacesTotal;
    private Geometry geometry;
    private String statut;
    private String heureMaj;
    private String ville;

    public Parking() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getNbPlacesDispo() {
        return nbPlacesDispo;
    }

    public void setNbPlacesDispo(Integer nbPlacesDispo) {
        this.nbPlacesDispo = nbPlacesDispo;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Integer getNbPlacesTotal() {
        return nbPlacesTotal;
    }

    public void setNbPlacesTotal(Integer nbPlacesTotal) {
        this.nbPlacesTotal = nbPlacesTotal;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getHeureMaj() {
        return heureMaj;
    }

    public void setHeureMaj(String heureMaj) {
        this.heureMaj = heureMaj;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
