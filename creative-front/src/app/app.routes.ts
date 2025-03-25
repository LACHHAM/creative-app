import { Routes } from '@angular/router';

export const routes: Routes = [
  {
    path: 'posts',
    loadComponent: () => import('./post/post.component').then((m) => m.PostComponent)
  }
];
