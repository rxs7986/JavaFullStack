import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-Profile',
  templateUrl: './Profile.component.html',
  styleUrls: ['./Profile.component.css']
})
export class ProfileComponent implements OnInit {


    fname = " ";
    lname = " ";
    dob = " ";
    phone = " ";
    email =" ";
    
  
     state = false;

  // pro = {
  //   fname: "Rachana",
  //   lname:"Sanda",
  //   dob:"01-08-1999",
  //   phone: 8179142734,
  //   university:"UTA",
  //   undergrad:"Stanley"
  // }

 

  showInfo()
  {
    this.state = true;
  }
  
  constructor() { }

  ngOnInit() {
  }

 


   

}
