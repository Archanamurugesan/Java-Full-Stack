import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MicroProjectComponent } from './micro-project.component';

describe('MicroProjectComponent', () => {
  let component: MicroProjectComponent;
  let fixture: ComponentFixture<MicroProjectComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MicroProjectComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MicroProjectComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
