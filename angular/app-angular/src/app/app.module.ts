import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TipoDeCambioComponent } from './components/tipo-de-cambio/tipo-de-cambio.component';
import { SaludoComponent } from './components/saludo/saludo.component';

@NgModule({
  declarations: [
    AppComponent,
    TipoDeCambioComponent,
    SaludoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
