import { Component } from '@angular/core';
import { PostComponent } from './post/post.component';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [PostComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'creative-sharing';
}
