import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http"
@Injectable({
  providedIn: 'root'
})
export class BooksService {
  url="http://localhost:8080/api";
  constructor(private http:HttpClient) { }

getBookList()
{



return this.http.get(this.url+"/books");

}
addBook(data:{[k: string]: any}){

return this.http.post(this.url+"/books",data)

}
deleteBook(id:any){


return this.http.delete(this.url+"/book/"+id,{ observe: 'response', responseType: 'text' });


}
getABook(id:number){

  return this.http.get(this.url+"/book/"+id)

}
updateBook(bookData:any,id:number){

  return this.http.put(this.url+"/books/"+id,bookData)

}
getAuthors(){
  return this.http.get(this.url+"/authors");

}
}
