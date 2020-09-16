import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { ParkingsComponent } from './parkings/parkings.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatCardModule } from '@angular/material/card';
import { MatProgressSpinnerModule } from '@angular/material/progress-spinner';
import { AppRoutingModule } from './app-routing.module';
import { ParkingDetailComponent } from './parking-detail/parking-detail.component';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MapComponent } from './map/map.component';
import { MarkerService } from './marker.service';
import { MapDetailService } from './map-detail.service';
import { PopUpService } from './pop-up.service';

@NgModule({
  declarations: [
    AppComponent,
    ParkingsComponent,
    ParkingDetailComponent,
    MapComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatCardModule,
    MatProgressSpinnerModule,
    AppRoutingModule,
    MatButtonModule,
    MatIconModule,
  ],
  providers: [MarkerService,MapDetailService,PopUpService],
  bootstrap: [AppComponent]
})
export class AppModule { }
