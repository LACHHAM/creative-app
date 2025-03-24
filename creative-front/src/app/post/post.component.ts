import { Component, inject, OnInit } from '@angular/core';
import { PostService } from './post.service';
import { Post } from './post';
import { CommonModule } from '@angular/common';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-post',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './post.component.html',
  styleUrl: './post.component.scss'
})
export class PostComponent implements OnInit{

  posts: Post[] = [];
  error: string | null = null;

  constructor(private postsService: PostService) { }

  ngOnInit(): void {
    this.loadPosts();
  }

  loadPosts(): void {
    this.error = null;
    this.postsService.getPosts().subscribe({
      next: (posts) => {
        this.posts = posts;
      },
      error: (err) => {
        this.error = 'Erreur lors du chargeent des posts';
      }
    });
  }

}
