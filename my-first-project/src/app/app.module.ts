import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { NavBarComponent } from './NavBar/NavBar.component';
import { LoginComponent } from './Login/Login.component';
import { SignupComponent } from './Signup/Signup.component';
import { ProfileComponent } from './Profile/Profile.component';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [			
    AppComponent,
    HeaderComponent,
      NavBarComponent,
      LoginComponent,
      SignupComponent,
      ProfileComponent
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