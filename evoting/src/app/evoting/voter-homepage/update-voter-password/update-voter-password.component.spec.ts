import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateVoterPasswordComponent } from './update-voter-password.component';

describe('UpdateVoterPasswordComponent', () => {
  let component: UpdateVoterPasswordComponent;
  let fixture: ComponentFixture<UpdateVoterPasswordComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateVoterPasswordComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateVoterPasswordComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
