import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PostComponent } from './post.component';
import { ActivatedRoute } from '@angular/router';
import { provideHttpClient } from '@angular/common/http';

describe('PostComponent', () => {
  let component: PostComponent;
  let fixture: ComponentFixture<PostComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PostComponent],
      providers: [
        provideHttpClient(),
        { provide: ActivatedRoute, useValue: {} }
      ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PostComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
