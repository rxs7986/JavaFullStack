import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './Login/Login.component';
import { SignupComponent } from './Signup/Signup.component';
import { ProfileComponent } from './Profile/Profile.component';
import { HeaderComponent } from './header/header.component';

const routes: Routes = [ 
 { path : 'login',
  component : LoginComponent} ,

 { path: 'signup',
  component: SignupComponent},

  {path: 'profile',
  component: ProfileComponent},

  {path:'header',
  component: HeaderComponent}

  



  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
