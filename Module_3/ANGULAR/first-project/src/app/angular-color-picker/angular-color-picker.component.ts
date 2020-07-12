import { Component, OnInit } from '@angular/core';

@Component({
  selector: '.app-angular-color-picker',
  template: `
  <h2>Color Picker</h2>
<div>
  <label>Chọn màu:</label>
  <input [value]="background" type="color" (change)="onChange($event.target.value)">
</div>

<p>Output:</p>
  <div class="color-preview" [style.background]="background"></div>
  `,
  styleUrls: ['./angular-color-picker.component.css']
})
export class AngularColorPickerComponent implements OnInit {
  public background;
  constructor() { }

  ngOnInit() {
  }
  onChange(value){
    this.background = value;
    console.log(value);
    
  }

}
