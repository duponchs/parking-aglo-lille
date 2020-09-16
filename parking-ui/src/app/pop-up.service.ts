import { Injectable } from '@angular/core';
import { ParkingInfo } from './parkinginfo';

@Injectable({
  providedIn: 'root'
})
export class PopUpService {

  constructor() { }
  
  makeParkingPopup(parking:ParkingInfo){
    return '<div>'+parking.nom +
    '<br> Nombre de places disponibles '+ parking.nbPlacesDispo.toString()+
    '<br> Statut '+parking.statut+'</div>';
  }
}
