import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  nombreApp: string = 'Curso de Angular';
  miNombre: string = 'Sebastián';
  nombreTrabajo = 'Universidad de Chile';
  cargo = 'Profesor';
  color = 'clase2';
  tipo = 'Escriba acá';
  obligatorio = true;
  valor: number = 0;
  size = 8;

  unidades: any[] = [
    {
      nombre: "Programacción en Java",
      numero: 1
    },{
      nombre: "Desarrollo Web",
      numero: 2
    }
  ]


  sumarValor(): void {
    this.valor+=100000000000;
  }

  aumentar(): void {
    if(this.size < 25){
      this.size += 1;
    }
  }

  disminuir(): void{
    if(this.size > 8){
      this.size -= 1;
    }
  }
}
