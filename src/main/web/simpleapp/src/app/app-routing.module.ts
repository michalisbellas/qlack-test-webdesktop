import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ImageListComponent } from './image-list/image-list.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  { path:  '', redirectTo:  'login', pathMatch:  'full'},
  {path: 'apps', component: ImageListComponent },
  {path: 'login', component: LoginComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
