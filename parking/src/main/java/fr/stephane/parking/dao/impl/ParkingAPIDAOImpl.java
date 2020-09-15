package fr.stephane.parking.dao.impl;

import fr.stephane.parking.dao.ParkingAPIDAO;
import fr.stephane.parking.dao.entity.ReponseParkingAPIEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class ParkingAPIDAOImpl implements ParkingAPIDAO {

    public static final String URL_API_OPEN_DATA = "https://opendata.lillemetropole.fr/api/records/1.0/search/?dataset=disponibilite-parkings&q=&rows=27";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ReponseParkingAPIEntity getListeParking() {
        return restTemplate.getForEntity(URL_API_OPEN_DATA,ReponseParkingAPIEntity.class).getBody();
    }


}
