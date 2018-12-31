import { Component, OnInit } from '@angular/core';
import { SnakeService } from '.../shared/snake/snake.service';

@Component({
  selector: 'app-snake-list',
  templateUrl: './snake-list.component.html',
  styleUrls: ['./snake-list.component.css']
})
export class SnakeListComponent implements OnInit {
  snakes: Array<any>;

  constructor(private snakeService: SnakeService) { }

  ngOnInit() {
    this.snakeService.getAll().subscribe(data => {
      this.snakes = data;
    })
  }

}
