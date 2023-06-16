import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  isLoggedIn = false;
  constructor() { }

  ngOnInit() {
  }


  toggleLogin() 
  {
    this.isLoggedIn = !this.isLoggedIn;
  }

}
