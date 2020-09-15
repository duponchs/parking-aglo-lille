import { Component, OnInit } from '@angular/core';
import * as L from 'leaflet';
import { ActivatedRoute } from '@angular/router';
import { ParkingService } from '../parking.service';
import { ParkingInfo } from '../parkinginfo';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.scss']
})
export class MapComponent implements OnInit  {
  map;
  
  smallIcon = new L.Icon({
    iconUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/images/marker-icon.png',
    iconRetinaUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/images/marker-icon-2x.png',
    iconSize: [25, 41],
    iconAnchor: [12, 41],
    popupAnchor: [1, -34],
    shadowUrl:'https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/images/marker-shadow.png',
    shadowSize: [41, 41]
  });

  parking:ParkingInfo;
  isLoaded:boolean = false;

  constructor(private route: ActivatedRoute, private parkingService:ParkingService) { }

  ngOnInit(): void {
    this.createMap();
  }

  createMap(){
    // Je creer une position pos de lille
    const agloLille = {
      lat: 50.6333,
      long: 3.0667,
    };
    // zoom standard
    const zoomLevel = 12;

    // j'applique les options a la map
    this.map = L.map('map',{
      center: [agloLille.lat, agloLille.long],
      zoom: zoomLevel
      
    });

    // je creer la page et met les sources de l'api
    const mainLayer = L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',{
      minZoom: 12,
      maxZoom:17,
      attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    });

    // j'associe les options
    mainLayer.addTo(this.map);


    //const description = `
    //  Centre ville de Lille
    //`
    // this.addMarker(description,agloLille);

    //this.addMarkerParking()
 
  }

  addMarker(description,agloLille){
    const marker = L.marker([agloLille.lat, agloLille.long],{ icon:this.smallIcon});
    marker.addTo(this.map).bindPopup(description);
  }
}
