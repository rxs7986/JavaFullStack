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
import { AccountsInfoComponent } from './accounts-info/accounts-info.component';
import { AuthComponent } from './auth/auth.component';
import { SharedComponent } from './shared/shared.component';



@NgModule({
  declarations: [							
    AppComponent,
    HeaderComponent,
      NavBarComponent,
      LoginComponent,
      SignupComponent,
      ProfileComponent,
      AccountsInfoComponent,
      AuthComponent,
      SharedComponent
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
