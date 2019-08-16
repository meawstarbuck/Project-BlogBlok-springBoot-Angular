import { Component, OnInit } from '@angular/core';

import * as ClassicEditor from '@ckeditor/ckeditor5-build-classic';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-editor',
  templateUrl: './editor.component.html',
  styleUrls: ['./editor.component.css']
})
export class EditorComponent implements OnInit {

  public model = {
    editorData: '<p>Hello, world!</p>'
  };

  public Editor = ClassicEditor;
  configUrl = 'https://reqres.in/api/users?page=2';
  constructor(private http: HttpClient) { }
  ngOnInit() {

  }

  post() {
    this.http.post("https://reqres.in/api/users",
      {
        "name": "morpheus",
        "job": "leader"
      })
      .subscribe(
        data => {
          console.log("POST Request is successful ", data);
        },
        error => {

          console.log("Error", error);

        }

      );
  }

  get() {
    this.http.get(this.configUrl).subscribe(Response => console.log(Response));

  }



}
