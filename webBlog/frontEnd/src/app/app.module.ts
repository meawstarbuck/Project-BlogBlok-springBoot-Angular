import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { NxButtonModule } from '@allianz/ngx-ndbx/button';
import { EditorComponent } from './editor/editor.component'

import { NxHeaderModule } from '@allianz/ngx-ndbx/header'
import { NxInputModule } from '@allianz/ngx-ndbx/input';
import { NxGridModule } from '@allianz/ngx-ndbx/grid';
import { NxPageSearchModule } from '@allianz/ngx-ndbx/page-search';
import { NxTabsModule } from '@allianz/ngx-ndbx/tabs';
import { CKEditorModule } from '@ckeditor/ckeditor5-angular';
import { HomeComponent } from './home/home.component';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    EditorComponent,
    HomeComponent
  ],
  imports: [
    CKEditorModule,
    NxButtonModule,
    NxHeaderModule,
    NxInputModule,
    NxGridModule,
    NxTabsModule,
    FormsModule, //for binding ngmodel from .ts to .html
    NxPageSearchModule,  
    BrowserModule, 
    AppRoutingModule,  
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
