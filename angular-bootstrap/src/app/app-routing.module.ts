import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './Login/Login.component';
import { ProfileComponent } from './Profile/Profile.component';
import { HomeComponent } from './Home/Home.component';

const routes: Routes = [

  {path: 'login',
  component: LoginComponent},
  {
    path: 'home',
    component: HomeComponent},

  

  
   


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
