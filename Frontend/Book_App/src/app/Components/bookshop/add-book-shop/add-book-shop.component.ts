import { Component } from '@angular/core';
import {FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';
import { BookshopService } from 'src/app/services/bookshop.service';
@Component({
  selector: 'app-add-book-shop',
  templateUrl: './add-book-shop.component.html',
  styleUrls: ['./add-book-shop.component.css']
})
export class AddBookShopComponent {
  list:any=[]

  addBookShop=new FormGroup({

    shopName: new FormControl('',Validators.required),
    location:new FormControl(''),
    email:new FormControl(''),
    contactNo:new FormControl('')
   
  })

  constructor(private bookshop:BookshopService){


  }
  submit(){
this.list.push(this.addBookShop.value)
this.bookshop.addBookShop(this.list).subscribe(data=>{

  window.alert("Bookshop successfully added")
})

  }
get shopName(){
  return this.addBookShop.get("shopName")
}


}
