import { Component } from '@angular/core';
import {BooksService} from "../../../services/books.service"
@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent {
 

   temp:any

 

  constructor(private books:BooksService){

  }



getBookData(bookData:{[k: string]: any}){



if(bookData['title']===''){
  window.alert("Title can't be empty")
  return ;
}
if(bookData['price']===''){
  window.alert("Price can't be empty")
  return ;
}
if(isNaN(Number(bookData['price']))){

  window.alert("Price smust be a number")
  return ;
}
bookData['price']=Number(bookData['price']);
if(isNaN(Number(bookData['yearOfPublish']))){

  window.alert("Year smust be a number")
  return ;
}
bookData['yearOfPublish']=Number(bookData['yearOfPublish']);
console.log(bookData)
this.books.addBook(bookData).subscribe(res=>{
console.log(res);
window.alert("book successfully added")
})


  }

}
