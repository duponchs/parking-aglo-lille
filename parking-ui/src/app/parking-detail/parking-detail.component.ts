import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ParkingService } from '../parking.service';
import { ParkingInfo } from '../parkinginfo';
import { MapDetailService } from '../map-detail.service';
import { MarkerService } from '../marker.service';


@Component({
  selector: 'app-parking-detail',
  templateUrl: './parking-detail.component.html',
  styleUrls: ['./parking-detail.component.scss']
})
export class ParkingDetailComponent implements OnInit {
  
  parking:ParkingInfo;
  isLoaded:boolean = false;

  constructor(private route: ActivatedRoute, private parkingService:ParkingService,private mapDetailService:MapDetailService, private marker:MarkerService ) { }

  ngOnInit(): void {
    const parkingId = this.route.snapshot.paramMap.get('id');
    this.parkingService.getParking(parkingId).subscribe(
      reponse =>{
        this.parking = reponse;
        this.isLoaded = true;
        this.mapDetailService.createMap(this.parking);
      }
    );
  }
  changeStatutPoint(parking:ParkingInfo){
    
    if(parking.statut === 'OUVERT'){
      return {color:'green'}
    }else if (parking.statut === 'ABONNES'){
      return {color:'orange'}
    }else if (parking.statut === 'FERME' || parking.statut === 'COMPLET'){
      return{color:'red'}
    }else{
      parking.statut='info non disponible'
      return{'font-style':'Italic'}
    }
  }
}
