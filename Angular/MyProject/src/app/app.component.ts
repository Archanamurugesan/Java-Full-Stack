import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
      flag : boolean;
      vehicles: string[];
      selectedVehicle : string = "";
      myStyle : {};
      myClass : string;

  constructor(){
    this.flag = true;
    this.vehicles =["Bike", "Car", "FourWheelers"];
    this.myStyle = {'width' : '40%' , 'border' : '2px solid green'}
    this.myClass = "myClass";
  }
 
  changeFlag(){
    this.flag = ! this.flag;
  }

  setSelectedItem(vec : string){
    this.selectedVehicle = vec;
  }
}



