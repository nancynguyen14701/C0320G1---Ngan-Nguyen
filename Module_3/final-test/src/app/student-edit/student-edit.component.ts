import { Router, ActivatedRoute } from '@angular/router';
import { StudentsService } from './../services/students.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student-edit',
  templateUrl: './student-edit.component.html',
  styleUrls: ['./student-edit.component.css']
})
export class StudentEditComponent implements OnInit {


  editStudentForm: FormGroup;
  private studentId;

  constructor(private fb: FormBuilder,
              private studentService: StudentsService,
              private router: Router,
              private route: ActivatedRoute) { }

  ngOnInit() {
    this.editStudentForm = this.fb.group({
      id:['', [Validators.required]],
      name:['',[Validators.required, Validators.pattern('^[a-zA-Z0-9]+$')]],
      group:['',[Validators.required]],
      topic:['',[Validators.required]],
      coach:['',[Validators.required]],
      email:['', [Validators.email, Validators.required]],
      phone:['', [Validators.required, Validators.pattern('^[0-9]{10,12}$')]]    
    });

    this.route.params.subscribe(data =>{
      this.studentId = data.id;
      this.studentService.getStudentById(this.studentId).subscribe(data => {
        console.log(data);
        
        this.editStudentForm.patchValue(data);
      })      
    })


  }

  editStudent(){
      this.studentService.editStudent(this.editStudentForm.value, this.studentId).subscribe(data =>{
        this.router.navigateByUrl("");
      })
  }

  backHome(){
    this.router.navigateByUrl("");
  }

}
