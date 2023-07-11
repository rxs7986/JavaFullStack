import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './Login/Login.component';
import { ProfileComponent } from './Profile/Profile.component';
import { NavBarComponent } from './NavBar/NavBar.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './Home/Home.component';
import { FormsModule } from '@angular/forms';
import { SubmissionsComponent } from './Submissions/Submissions.component';




@NgModule({
  declarations: [									
    AppComponent,
      LoginComponent,
      ProfileComponent,
      NavBarComponent,
      HeaderComponent,
      HomeComponent,
      SubmissionsComponent
   ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
