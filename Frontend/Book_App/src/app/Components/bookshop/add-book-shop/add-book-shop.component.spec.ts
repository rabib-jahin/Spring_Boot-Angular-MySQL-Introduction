import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddBookShopComponent } from './add-book-shop.component';

describe('AddBookShopComponent', () => {
  let component: AddBookShopComponent;
  let fixture: ComponentFixture<AddBookShopComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AddBookShopComponent]
    });
    fixture = TestBed.createComponent(AddBookShopComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
