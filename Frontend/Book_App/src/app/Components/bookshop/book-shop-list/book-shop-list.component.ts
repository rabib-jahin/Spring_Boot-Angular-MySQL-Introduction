import { Component } from '@angular/core';
import { BookshopService } from 'src/app/services/bookshop.service';
import { BooksService } from 'src/app/services/books.service';
@Component({
  selector: 'app-book-shop-list',
  templateUrl: './book-shop-list.component.html',
  styleUrls: ['./book-shop-list.component.css']
})
export class BookShopListComponent {

  constructor(private bookShopService:BookshopService,private  books:BooksService){

  }
  bookShopList:any
  bookList:any
  selBooks:any=[]
  isLoading:boolean=false
  bookshop:any

  async loadBookShops(){
    this.isLoading=true;
     await this.bookShopService.getBookShopList().subscribe(data=>{
        this.bookShopList=data;
        this.isLoading=false;
        })
    
    
   
    
    
    }
    saveData(data:any){

      this.bookshop=data
 
      
      }

async getBooks(id:any){
 await this.books.getBookList().subscribe(data=>{
    this.bookList=data;
  this.bookList.forEach((e:any)=>e?.bookShop?.forEach((e1:any)=>{

if(e1?.shopNumber===id){
  this.selBooks.push(e)
}
  }))
  console.log(this.selBooks)

    })






}

      delete(id:any){

    let temp=confirm("Do you want to delete the bookshop?");

    if(temp){
      console.log(temp)
    this.bookShopService.deleteBooksShop(id).subscribe(data=>{
  window.alert("successfully deleted the bookshop")
  this.loadBookShops()
})
    }
      }

}
