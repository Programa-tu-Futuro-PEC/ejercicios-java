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
  usuarios = [
    {rut:'1-9', nombres: "perico", apellido: "perez", correo: "a@c.l"},
    {rut:'1-9', nombres: "perico", apellido: "perez", correo: "a@c.l"},
    {rut:'1-9', nombres: "perico", apellido: "perez", correo: "a@c.l"},
  ]
  columnasAMostrar2 = ['rut', 'nombres', 'apellido', 'correo']

  toggleRut(){
    if(this.columnasAMostrar2.includes('rut')){
      this.columnasAMostrar2.splice(0,1);
    } else {
      this.columnasAMostrar2.unshift('rut');
    }
  }

  buttonLabel(){
    if(this.columnasAMostrar2.includes('rut')){
      return "Quitar RUT"
    } else {
      return "Mostrar RUT"
    }
  }

}
