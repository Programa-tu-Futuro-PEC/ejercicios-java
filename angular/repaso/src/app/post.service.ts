import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  apiURL = 'https://jsonplaceholder.typicode.com/posts';
  posts: any[];

  constructor(private http: HttpClient) { }

  obtenerPosts(): Observable<any[]>{
    return this.http.get<any[]>(this.apiURL);
  }

}
