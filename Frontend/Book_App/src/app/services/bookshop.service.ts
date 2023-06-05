import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http"
@Injectable({
  providedIn: 'root'
})
export class BookshopService {

  url="http://localhost:8080/api";
  constructor(private http:HttpClient) { }

  getBookShopList()
  {
  
  
  
  return this.http.get(this.url+"/bookshops");
  
  } 
}
