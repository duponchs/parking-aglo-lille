package fr.stephane.parking.service.impl;

import fr.stephane.parking.dao.ParkingAPIDAO;
import fr.stephane.parking.dao.entity.RecordsEntity;
import fr.stephane.parking.dao.entity.ReponseParkingAPIEntity;
import fr.stephane.parking.model.Parking;
import fr.stephane.parking.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {

    @Autowired
    public ParkingAPIDAO parkingAPIDAO;

    @Override
    public List<Parking> getListeParking() {
        ReponseParkingAPIEntity reponse = parkingAPIDAO.getListeParking();

        return transformeEntityModel(reponse);
    }

    private List<Parking> transformeEntityModel(ReponseParkingAPIEntity reponse) {
        List<Parking> resultat = new ArrayList<>();

        for(RecordsEntity record: reponse.getRecors()) {
            Parking parking = new Parking();
            parking.setId(record.getFields().getId());
            parking.setNom(record.getFields().getLibelle());
            parking.setStatut(record.getFields().getEtat());
            parking.setNbPlacesDispo(record.getFields().getNbPlaceDisponible());
            parking.setGeometry(record.getFields().getGeometry());
            parking.setNbPlacesTotal(record.getFields().getNbPlaceMaxi());
            parking.setHeureMaj(getHeureDateMaj(record));
            parking.setVille(record.getFields().getVille());

            resultat.add(parking);
        }
        return resultat;
    }

    private String getHeureDateMaj(RecordsEntity record) {
        OffsetDateTime dateMAJ = OffsetDateTime.parse(record.getFields().getDateMaj());
        //rajoute 2h00
        OffsetDateTime dateMAJWithOffSetPlus2 = dateMAJ.withOffsetSameInstant(ZoneOffset.of("+02:00"));

        return dateMAJWithOffSetPlus2.getHour()+ "h" +dateMAJWithOffSetPlus2.getMinute();
    }
}
