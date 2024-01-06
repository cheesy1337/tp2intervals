import { Component } from '@angular/core';
import { MatGridListModule } from "@angular/material/grid-list";
import { FormBuilder, FormGroup, FormsModule, ReactiveFormsModule, Validators } from "@angular/forms";
import { MatButtonModule } from "@angular/material/button";
import { MatCardModule } from "@angular/material/card";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatInputModule } from "@angular/material/input";
import { WorkoutService } from "infrastructure/workout.service";
import { Router } from "@angular/router";
import { MatProgressBarModule } from "@angular/material/progress-bar";
import { NgIf } from "@angular/common";
import { MatDatepickerModule } from "@angular/material/datepicker";
import { MatNativeDateModule } from "@angular/material/core";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    MatGridListModule,
    FormsModule,
    MatButtonModule,
    MatCardModule,
    MatFormFieldModule,
    MatInputModule,
    ReactiveFormsModule,
    MatProgressBarModule,
    NgIf,
    MatDatepickerModule,
    MatNativeDateModule
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

  copyPlanFormGroup: FormGroup = this.formBuilder.group({
    startDate: [null, Validators.required],
    endDate: [null, Validators.required],
  });

  copyPlanInProgress = false
  planWorkoutInProgress = false

  constructor(
    private router: Router,
    private formBuilder: FormBuilder,
    private workoutService: WorkoutService) {
  }

  copyPlanSubmit() {
    this.copyPlanInProgress = true
    let startDate = this.copyPlanFormGroup.value.startDate.toISOString().split('T')[0]
    let endDate = this.copyPlanFormGroup.value.endDate.toISOString().split('T')[0]
    this.workoutService.copyPlan(startDate, endDate).subscribe(() => {
      this.copyPlanInProgress = false
    })
  }

  planWorkoutClick() {
    this.planWorkoutInProgress = true
    this.workoutService.planWorkout()
      .subscribe(() => this.planWorkoutInProgress = false)
  }
}
