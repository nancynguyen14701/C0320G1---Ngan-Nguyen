import { DeleteConfirmComponent } from './delete-confirm/delete-confirm.component';
import { MatDialog } from '@angular/material/dialog';
import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'case-study';

  constructor(public dialog : MatDialog){}

  // openDialog(){
  //   this.dialog.open(DeleteConfirmComponent);
  // }
  
  
}
