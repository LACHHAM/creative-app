import { TestBed } from '@angular/core/testing';

import { PostService } from './post.service';
import { provideHttpClient, withInterceptorsFromDi } from '@angular/common/http';


describe('PostService', () => {
  let service: PostService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [
        PostService,
        provideHttpClient(withInterceptorsFromDi()),
      ]
    });
    service = TestBed.inject(PostService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
