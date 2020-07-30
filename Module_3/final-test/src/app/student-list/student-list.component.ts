import { StudentsService } from './../services/students.service';
import { Component, OnInit } from '@angular/core';
import { StudentDeleteComponent } from '../student-delete/student-delete.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-student-list',
  templateUrl: './student-list.component.html',
  styleUrls: ['./student-list.component.css']
})
export class StudentListComponent implements OnInit {

  private students;
  private studentData;

  constructor(private studentService: StudentsService,
              private dialog: MatDialog) { }

  ngOnInit() {

    this.studentService.getAllStudents().subscribe(data =>{
      this.students = data
    })
  }

  openDialog(student){
    this.studentData = student;
    const dialogRef = this.dialog.open(StudentDeleteComponent, {
      width: "400px",
      data: {student: this.studentData},
      disableClose: true

    })

    dialogRef.afterClosed().subscribe(data => {
     if (data !== "action" ){
      this.students = this.students.filter(
       t => t.id !== student.id        
      )
     }
    })

  }

}
