import { Component } from '@angular/core';

Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
interface Expense {
  date: string;
  category: string;
  amount: number;
}

function addExpense(expense: Expense): void {
  const table: HTMLTableElement = document.getElementById('expense-table') as HTMLTableElement;
  const row: HTMLTableRowElement = table.insertRow();

  const dateCell: HTMLTableCellElement = row.insertCell(0);
  const categoryCell: HTMLTableCellElement = row.insertCell(1);
  const amountCell: HTMLTableCellElement = row.insertCell(2);

  dateCell.textContent = expense.date;
  categoryCell.textContent = expense.category;
  amountCell.textContent = expense.amount.toString();
}

document.getElementById('expense-form')!.addEventListener('submit', function(event: Event): void {
  event.preventDefault();

  const dateInput: HTMLInputElement = document.getElementById('date') as HTMLInputElement;
  const categoryInput: HTMLInputElement = document.getElementById('category') as HTMLInputElement;
  const amountInput: HTMLInputElement = document.getElementById('amount') as HTMLInputElement;

  const expense: Expense = {
      date: dateInput.value,
      category: categoryInput.value,
      amount: parseFloat(amountInput.value)
  };

  addExpense(expense);

  (document.getElementById('expense-form') as HTMLFormElement).reset();
});

