import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

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
     logout = false;




  




    

  pro = {
    fname: "Rachana",
    lname:"Sanda",
    dob:"01-08-1999",
    phone: 8179142734,
    university:"UTA",
    undergrad:"Stanley"
  }

 

  showInfo()
  {
    this.state = true;

  }
 
  
  constructor(private router: Router) { }

  ngOnInit() {
  }

  isLoggedOut()
  {
    
    this.router.navigate(['/']);
    alert("Loggedout Successfully!")
    console.log("Loggedout Successfully!");
    

  }

 

   


   

}
