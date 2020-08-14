import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nombreApp = 'Curso de Angular';
  miNombre = 'Sebastián';
  nombreTrabajo = 'Universidad de Chile';
  cargo = 'Profesor';
  color = 'clase2';
  tipo = 'Escriba acá';
  obligatorio = true;
  valor = 0;
  size = 8;
  nombre = '';
  pesos = 0;
  pesosPorDolar = 793.0;

  sumarValor() {
    this.valor+=100000000000;
  }

  aumentar(){
    if(this.size < 25){
      this.size += 1;
    }
  }

  disminuir(){
    if(this.size > 8){
      this.size -= 1;
    }
  }
}
