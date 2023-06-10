import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BooklistComponent } from './Components/book/booklist/booklist.component';
import { BookShopListComponent } from './Components/bookshop/book-shop-list/book-shop-list.component';
const routes: Routes = [

  {
component:BooklistComponent,
path:""

  },
{
  component:BookShopListComponent,
  path:"bookshop"

}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
