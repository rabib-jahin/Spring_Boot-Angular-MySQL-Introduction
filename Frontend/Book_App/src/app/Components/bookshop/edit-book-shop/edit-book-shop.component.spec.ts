import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditBookShopComponent } from './edit-book-shop.component';

describe('EditBookShopComponent', () => {
  let component: EditBookShopComponent;
  let fixture: ComponentFixture<EditBookShopComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EditBookShopComponent]
    });
    fixture = TestBed.createComponent(EditBookShopComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
