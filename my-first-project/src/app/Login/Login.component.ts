import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-Login',
  templateUrl: './Login.component.html',
  styleUrls: ['./Login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  email:string = '';
  password:string = '';

 


 Submit()
  {
   console.log("Email is: " +this.email)
   console.log("Password is: " +this.password)
  }

  Cancel(){
    console.log("Cancelled!!")
  }

}

