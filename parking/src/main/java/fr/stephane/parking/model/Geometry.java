package fr.stephane.parking.model;

import java.util.List;

/**
 * publique classe Geometry
 */
public class Geometry {
    private String type;
    private List<Float> coordinates;

    /**
     * Constructeur vide
     */
    public Geometry() {
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return coordinates
     */
    public List<Float> getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates
     */
    public void setCoordinates(List<Float> coordinates) {
        this.coordinates = coordinates;
    }
}
