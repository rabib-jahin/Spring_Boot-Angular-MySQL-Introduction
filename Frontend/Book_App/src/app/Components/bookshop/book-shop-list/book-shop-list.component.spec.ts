import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookShopListComponent } from './book-shop-list.component';

describe('BookShopListComponent', () => {
  let component: BookShopListComponent;
  let fixture: ComponentFixture<BookShopListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BookShopListComponent]
    });
    fixture = TestBed.createComponent(BookShopListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
