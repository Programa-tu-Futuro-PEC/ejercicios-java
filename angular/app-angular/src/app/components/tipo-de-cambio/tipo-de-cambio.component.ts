import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tipo-de-cambio',
  templateUrl: './tipo-de-cambio.component.html',
  styleUrls: ['./tipo-de-cambio.component.css']
})
export class TipoDeCambioComponent implements OnInit {

  pesos = 0;
  pesosPorDolar: number = 793.0;

  constructor() { }

  ngOnInit(): void {
  }

}
