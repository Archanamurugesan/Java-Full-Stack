import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Expenses } from './model/Expenses';

@Injectable({
  providedIn: 'root'
})
export class ExpensesService {
    url : string;
    expenses : Expenses;
    expensesArr : Expenses[];
  
   constructor(private http : HttpClient) {
    
    this.url = "http://localhost:3005/expenses";
    this.expenses = new Expenses();
    this.expensesArr = [];

   }

   insertExpenses(expenses : Expenses){
    this.http.post<Expenses>(this.url,expenses).subscribe();
    return "Expense Details Added"

   }

   updateExpenses(expenses : Expenses){
    this.http.put<Expenses>(this.url+"/"+expenses.id,expenses).subscribe();
    return "Expense Details Updated"
 
   }

   
  deleteExpenses (Id : number){
    this.http.delete<Expenses>(this.url+"/"+Id).subscribe();
    return "Expenses Details Deleted"
  }

  findExpenses(Id : number){
    this.http.get<Expenses>(this.url+"/"+Id).subscribe(data => this.expenses = data);
    return this.expenses;
  }
  
  findAllExpenses(){
    this.http.get<Expenses[]>(this.url).subscribe(data => this.expensesArr = data);
    return this.expensesArr;
  }
}
