import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-playlist',
  templateUrl: './playlist.component.html',
  styleUrls: ['./playlist.component.css']
})
export class PlaylistComponent implements OnInit {
  ngOnInit(): void {
  }

  canciones = [];
  cancion: string = '';
  album: string = '';
  autor: string = '';

  agregarCancion(){
    if(this.cancion && this.autor && this.album){
      var x = {
        cancion: this.cancion,
        album: this.album,
        autor: this.autor
      };
      this.canciones.push(x);
    }
  }

}
