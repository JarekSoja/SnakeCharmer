import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { SnakeService } from './shared/snake/snake.service';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { SnakeListComponent } from './snake-list/snake-list.component';

@NgModule({
  declarations: [
    AppComponent,
    SnakeListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [SnakeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
