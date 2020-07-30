import { StudentsService } from './../services/students.service';
import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';

@Component({
  selector: 'app-student-delete',
  templateUrl: './student-delete.component.html',
  styleUrls: ['./student-delete.component.css']
})
export class StudentDeleteComponent implements OnInit {

  private studentName;

  constructor(private dialogRef: MatDialogRef<StudentDeleteComponent>,
              @Inject (MAT_DIALOG_DATA) private data: any,
              private studentService: StudentsService
  ) { }

  ngOnInit() {

    this.studentName = this.data.student.name;

  }

  onYesClick(){
    this.studentService.deleteStudentById(this.data.student.id).subscribe( data =>{
      this.dialogRef.close();
    })
  }
}
