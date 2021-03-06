import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SnakeListComponent } from './snake-list.component';

describe('SnakeListComponent', () => {
  let component: SnakeListComponent;
  let fixture: ComponentFixture<SnakeListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SnakeListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SnakeListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
