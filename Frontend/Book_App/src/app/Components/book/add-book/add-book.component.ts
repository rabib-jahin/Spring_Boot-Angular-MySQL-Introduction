import { Component ,OnInit} from '@angular/core';
import {BooksService} from "../../../services/books.service"
import {FormGroup,FormControl,Validators} from "@angular/forms"
@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css']
})
export class AddBookComponent{


  
  addBook=new FormGroup({

title: new FormControl('',Validators.required),
price:new FormControl('',Validators.required),
yearOfPublish:new FormControl(2023),
genre:new FormControl(''),
publisher:new FormControl(''),
authors:new FormControl([]),
bookShop:new FormControl([])


  })

   temp:any

 

  constructor(private books:BooksService){

  }
 
  getBookData(){
console.log(this.addBook.value)
if(this.addBook.value.title===''){
  window.alert("Title can't be empty")
  return ;
}
if(this.addBook.value.price===''){
  window.alert("Price can't be empty")
  return ;
}
if(isNaN(Number(this.addBook.value.price))){

  window.alert("Price must be a number")
  return ;
}
Number(this.addBook.value.price);
if(isNaN(Number(this.addBook.value.yearOfPublish))){

  window.alert("Year must be a number")
  return ;
}
this.temp=this.addBook.value;
this.temp['price']=Number(this.addBook.value.price);

console.log(this.temp)
this.books.addBook(this.temp).subscribe(res=>{
console.log(res);
window.alert("book successfully added")
})

  }
get title(){return this.addBook.get('title')}
get price(){return this.addBook.get('price')}


}
