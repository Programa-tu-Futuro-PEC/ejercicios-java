import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  comunas: string[] = [
    "La Cisterna",
    "La Florida",
    "Pudahuel",
    "Santiago",
    "Macul",
    "Ñuñoa"
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
