import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BooklistComponent } from './Components/book/booklist/booklist.component';
import { NavbarComponent } from './Components/navbar/navbar.component';
import {HttpClientModule} from "@angular/common/http";
import { AddBookComponent } from './Components/book/add-book/add-book.component';
import { EditBookComponent } from './Components/book/edit-book/edit-book.component'
import { FormsModule }   from '@angular/forms';
import {ReactiveFormsModule} from "@angular/forms"
@NgModule({
  declarations: [
    AppComponent,
    BooklistComponent,
    NavbarComponent,
    AddBookComponent,
    EditBookComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule ,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
