import { Injectable } from '@angular/core';
import { ParkingService } from './parking.service';
import * as L from 'leaflet';
import { ParkingInfo } from './parkinginfo';
import { PopUpService } from './pop-up.service';

@Injectable({
  providedIn: 'root'
})
export class MarkerService {
  
  parkings:ParkingInfo[];
  constructor(private parkingService:ParkingService, private popupService:PopUpService) { }

  makeParkingsMarkers(map: L.Map): void {
    this.parkingService.getParkings().subscribe((parkings)=>{
      for(const parking of parkings){
        const lat = parking.geometry.coordinates[0];
        const lon = parking.geometry.coordinates[1];
        const marker = L.marker([lon, lat]).bindPopup(this.popupService.makeParkingPopup(parking));
        marker.addTo(map);
      }
    });
  }
  makeParkingMarker(map: L.Map,parking:ParkingInfo): void {
      const lat = parking.geometry.coordinates[0];
      const lon = parking.geometry.coordinates[1];
      const marker = L.marker([lon, lat]).bindPopup(this.popupService.makeParkingPopup(parking));
      marker.addTo(map);
  }
}
