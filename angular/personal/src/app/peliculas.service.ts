import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PeliculasService {

  constructor(private http: HttpClient) { }

  private apiURL = 'api/';  // URL de la API

  getPeliculas(): Observable<Pelicula[]> {
    return this.http.get<Pelicula[]>(this.apiURL)
  }

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };
  agregarPelicula(pelicula: Pelicula): Observable<Pelicula> {
    return this.http
          .post<Pelicula>(this.apiURL, pelicula, this.httpOptions)
  }

}

export interface Pelicula {
  nombre: string,
  año: number,
  calificacion: number
}
