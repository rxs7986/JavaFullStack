import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-NavBar',
  templateUrl: './NavBar.component.html',
  styleUrls: ['./NavBar.component.css']
})
export class NavBarComponent implements OnInit {

  isLoggedIn = false;

  constructor() { }

  ngOnInit() {
  }
 

  toggleLogin() {
    this.isLoggedIn = !this.isLoggedIn;
  } 
}
