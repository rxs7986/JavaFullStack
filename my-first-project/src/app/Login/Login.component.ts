import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-Login',
  templateUrl: './Login.component.html',
  styleUrls: ['./Login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  email:string = '';
  password:string = '';

 
 
 Submit()
  {
   console.log("Email is: " +this.email)
   console.log("Password is: " +this.password)

   if(this.email === "rach@01" && this.password === "12345")
   {
    this.router.navigate(['/profile']);
   }
   else{
    alert("Invalid details!")
   }
  }

  Cancel(){
    console.log("Cancelled!!")
  }

}

