import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'personal';
  yo: string;
  lista = [
    {id: 1, nombre: 'perrito'},
    {id: 2, nombre: 'gatito'}
  ]
  columnasAMostrar = ['nombre']
}
