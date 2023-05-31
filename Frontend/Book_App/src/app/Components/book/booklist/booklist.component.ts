import { Component } from '@angular/core';
import {BooksService} from "../../../services/books.service"
@Component({
  selector: 'app-booklist',
  templateUrl: './booklist.component.html',
  styleUrls: ['./booklist.component.css']
})
export class BooklistComponent {

 
bookList:any
isLoading:boolean=false
temp:boolean=false
constructor(private books:BooksService){



}

async loadBooks(){
this.isLoading=true;
 await this.books.getBookList().subscribe(data=>{
    this.bookList=data;
    this.isLoading=false;
    })


console.log(this.bookList)


}
delete(id:any){

this.temp=confirm("Do you want to delete the book?");
if(this.temp){
this.books.deleteBook(id).subscribe(next=>{



this.loadBooks();

  },(err)=>{


    window.alert("Failed to delete the book") 
  })
}


}
}
