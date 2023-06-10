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
addBookShop(data:any){


  return this.http.post(this.url+"/bookshops",data)
}
  updateBookShop(bookShopData:any,id:any)
  {
  
  
  
  return this.http.put(this.url+"/bookshops/"+id,bookShopData);
  
  } 
  deleteBooksShop(id:any){

      
  return this.http.delete(this.url+"/bookshop/"+id);
  }
}
