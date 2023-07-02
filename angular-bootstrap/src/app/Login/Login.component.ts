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

  email = '';
  password = '';

  login()
  {
     console.log("login submit clicked!")
         if(this.email === 'rach@01' && this.password ==='1234')
         {
          console.log("inside if block")
              this.router.navigate(['/home']);
         }
         else
         alert('invalid details')
  }

}
