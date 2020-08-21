import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tabla',
  templateUrl: './tabla.component.html',
  styleUrls: ['./tabla.component.css']
})
export class TablaComponent implements OnInit {

  estudiantes = [
    {rut:'1-9', nombre:'perrito', apellido:'gonzalez', correo:'a@gmail.com'},
    {rut:'1-9', nombre:'perrito', apellido:'gonzalez', correo:'a@gmail.com'},
    {rut:'1-9', nombre:'perrito', apellido:'gonzalez', correo:'a@gmail.com'},
    {rut:'1-9', nombre:'perrito', apellido:'gonzalez', correo:'a@gmail.com'},
    {rut:'1-9', nombre:'perrito', apellido:'gonzalez', correo:'a@gmail.com'},
    {rut:'1-9', nombre:'perrito', apellido:'gonzalez', correo:'a@gmail.com'},
  ]

  columnasAMostrar: string[] = ['rut', 'nombre', 'apellido', 'correo', 'boton']

  constructor() { }

  ngOnInit(): void {
  }

  eliminar(i: number){
    this.estudiantes.splice(i, 1);
    console.log(this.estudiantes);
  }

}
