import { Component } from '@angular/core';
import { PostComponent } from './post/post.component';
import { RouterLink, RouterOutlet } from '@angular/router';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterLink, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'creative-front';
}
