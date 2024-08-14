import { Component } from '@angular/core';
import { ExpensesService } from './expenses.service';
import { Expenses } from './model/Expenses';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'MicroProject';
  expenses : Expenses;
  result : string;
  expensesArr : Expenses[];
  flag : Boolean;


  constructor(private service : ExpensesService){
    this.expenses= new Expenses();
    this.result = " ";
    this.expensesArr=[];
    this.flag = false;
  }

  insertExpenses(data : any){
    this.expenses.id = data.Id;
    this.expenses.place = data.place;
    this.expenses.category = data.category;
    this.expenses.amount = data.amount;
    this.result = this.service.insertExpenses(this.expenses);

}

updateExpenses(data : any){
  this.expenses.id = data.Id;
  this.expenses.place = data.place;
  this.expenses.category = data.category;
  this.expenses.amount = data.amount;
  this.result = this.service.updateExpenses(this.expenses);

}

deleteExpenses(data : any){
  this.result =  this.service.deleteExpenses(data.Id);

}


findExpenses(data : any) {
  this.expenses = this.service.findExpenses(data.Id);
  this.result = this.expenses.id + " " + this.expenses.place +" "+this.expenses.category+" "+this.expenses.amount;
}


findAllExpenses() {
  this.expensesArr = this.service.findAllExpenses();
  this.flag = true;
}

}

