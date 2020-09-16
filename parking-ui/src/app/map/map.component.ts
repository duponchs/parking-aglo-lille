import { Component, AfterViewInit } from '@angular/core';
import * as L from 'leaflet';
import { MarkerService } from '../marker.service';

const smallIcon = new L.Icon({
  iconUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/images/marker-icon.png',
  iconRetinaUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/images/marker-icon-2x.png',
  iconSize: [25, 41],
  iconAnchor: [12, 41],
  popupAnchor: [1, -34],
  shadowUrl:'https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/images/marker-shadow.png',
  shadowSize: [41, 41]
});
L.Marker.prototype.options.icon = smallIcon;

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.scss']
})
export class MapComponent implements AfterViewInit {
  private map;

  constructor(private markerService: MarkerService) { }

  ngAfterViewInit():void{
    this.createMap();
    this.markerService.makeParkingsMarkers(this.map);
  }

  createMap(){
    this.initMap();
  }

  private initMap():void{
     // Je creer une position pos de lille
     const agloLille = {
      lat: 50.6333,
      long: 3.0667,
    };
    // zoom standard
    const zoomLevel = 12;

    //init map
    this.map = L.map('map',{
      center:[agloLille.lat,agloLille.long],
      zoom: zoomLevel
    });
    // je creer la page et met les sources de l'api
    const mainLayer = L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',{
      minZoom: 12,
      maxZoom:19,
      attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    });

    // j'associe les tuiles
    mainLayer.addTo(this.map);
  }
}
