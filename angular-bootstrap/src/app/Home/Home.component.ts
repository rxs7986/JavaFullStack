import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-Home',
  templateUrl: './Home.component.html',
  styleUrls: ['./Home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router) { }
  isSubmitted = false;

  ngOnInit() {
  }

  Submission()
  {
    this.isSubmitted = true;

    if(this.isSubmitted)
    {
      this.router.navigate(['/submissions'])
    }

  }

}
