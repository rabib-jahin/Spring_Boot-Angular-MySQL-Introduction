import { Component, Input, SimpleChanges } from '@angular/core';
import { FormBuilder, FormControl, Validators } from '@angular/forms';
import { BookshopService } from 'src/app/services/bookshop.service';
@Component({
  selector: 'app-edit-book-shop',
  templateUrl: './edit-book-shop.component.html',
  styleUrls: ['./edit-book-shop.component.css']
})
export class EditBookShopComponent {
@Input() item:any
constructor(private fb:FormBuilder,private bookShopService:BookshopService){

}

updateBookShop=this.fb.group({

  shopName: new FormControl('',Validators.required),
  location:new FormControl(''),
  email:new FormControl(''),
  contactNo:new FormControl('')
 
})

ngOnChanges(changes: SimpleChanges) {
 
  console.log(changes['item'].currentValue)
   if(changes['item'].currentValue.shopNumber>0){
 
 this.updateBookShop=this.fb.group({
 
   shopName: new FormControl(this.item["shopName"],Validators.required),
   location:new FormControl(this.item["location"]),
   email:new FormControl(this.item["email"]),
   contactNo:new FormControl(this.item["contactNo"])
 
   
     
 

 
    
 
 
 
   
 })
 
   }
 }
 submitData(){

this.bookShopService.updateBookShop(this.updateBookShop.value,this.item["shopNumber"]).subscribe(data=>{


  window.alert("Successfully Updated");
})
  
  
  }
get shopName(){

  return this.updateBookShop.get("shopName")
}

}
