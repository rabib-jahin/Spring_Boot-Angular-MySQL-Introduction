import { Component,Input,OnInit ,OnChanges, SimpleChanges} from '@angular/core';
import {BooksService} from "../../../services/books.service"
import {BookshopService} from "../../../services/bookshop.service"
import {FormGroup,FormControl,Validators, FormArray, FormBuilder} from "@angular/forms"

@Component({
  selector: 'app-edit-book',
  templateUrl: './edit-book.component.html',
  styleUrls: ['./edit-book.component.css']
})
export class EditBookComponent  implements OnChanges  {

  book:any;
  bookshopsData:any
  auths:any
  counter:number=0
  updatedAuths:any
  updatedBookData:any
  updatedShops:any
  isSelected:any=[]

      constructor(private books:BooksService,private bookshops:BookshopService,private fb:FormBuilder){

  this.books.getAuthors().subscribe(data=>{
this.auths=data
  })
  this.bookshops.getBookShopList().subscribe(data=>{
    console.log(data)
    this.bookshopsData=data
      })

      }

 @Input() item:any

 updateBook=this.fb.group({

  title: new FormControl('',Validators.required),
  price:new FormControl('',Validators.required),
  yearOfPublish:new FormControl(2025),
  genre:new FormControl(''),
  publisher:new FormControl(''),
  authors:this.fb.array([

    this.fb.control('')
  ]),
  bookShop:this.fb.array([

    this.fb.control('')
  ])
  
  
    })
 ngOnChanges(changes: SimpleChanges) {
 
 console.log(changes['item'].currentValue)
  if(changes['item'].currentValue.bookId>0){

this.books.getABook(changes['item'].currentValue.bookId).subscribe((data)=>{

this.book=data;
this.counter=1;
this.updateBook=this.fb.group({

  title: new FormControl(this.book["title"],Validators.required),
  price:new FormControl(this.book["price"],Validators.required),
  yearOfPublish:new FormControl(this.book["yearOfPublish"]),
  genre:new FormControl(this.book["genre"]),
  publisher:new FormControl(this.book["publisher"]),
  authors:this.fb.array([
    this.fb.control('')

  ]),
  bookShop:this.fb.array([
    this.fb.control('')

  ])
  
  
    })

    if(this.book['authors'].length>0){
      this.authors.removeAt(0)
      this.book['authors'].forEach((data:any,idx:number)=>{
       
        this.authors.push(this.fb.control(''))
       this.authors.controls[idx].setValue(data["authorId"])
       
  this.isSelected.push(data['authrId'])
        


      })
     
    }

    if(this.book['bookShop'].length>0){
      this.bookShop.removeAt(0)
      this.book['bookShop'].forEach((data:any,idx:number)=>{
       
        this.bookShop.push(this.fb.control(''))
       this.bookShop.controls[idx].setValue(data["shopNumber"])
       

        


      })
     
    }
   



  
})

  }
}
get authors(){
  return this.updateBook.get('authors') as FormArray

}
get bookShop(){
  return this.updateBook.get('bookShop') as FormArray

}


ngOnInit(): void{
 

}

addNewAuthor(){

this.authors.push(this.fb.control(''))

}
delAuthor(i:number){

  this.authors.removeAt(i);
  
  }
  addNewBookShop(){

    this.bookShop.push(this.fb.control(''))
    
    } 
    delBookShop(i:number){

      this.bookShop.removeAt(i);
      
      }
onOptionsSelected(id:any){
  
console.log(this.authors)
  this.counter=0;



console.log(this.updateBook.value)
  }

submitData(){

  this.updatedAuths=[]
  this.updatedShops=[]
  this.counter=0
  for(let author of this.authors.controls){
  this.updatedAuths.push(this.auths.find((a:any)=>a.authorId==this.updateBook.get(['authors',this.counter])?.value) )
  this.counter+=1;
  
  }
this.counter=0;
  for(let shop of this.bookShop.controls){
    this.updatedShops.push(this.bookshopsData.find((a:any)=>a.shopNumber==this.updateBook.get(['bookShop',this.counter])?.value) )
    this.counter+=1;
    
    }
this.updatedBookData=this.updateBook.value;
this.updatedBookData['authors']=this.updatedAuths
this.updatedBookData['bookShop']=this.updatedShops
console.log(this.updatedBookData)
this.books.updateBook(this.updatedBookData,this.item?.bookId).subscribe(data=>{

  alert("successfully updated book data")
  
});

}
get title(){return this.updateBook.get('title')}
get price(){return this.updateBook.get('price')}
}
