import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {

    List<Expense> expenses = new ArrayList<>();

    // adds an expense to list
    
    public void addExpense(Expense expense){
         
        expenses.add(expense);
    }

    // remove an expense from the list

  public void removeExpense(Expense expense){

    expenses.remove(expense);

  }

  public void expensesByMonth(String month){
    List <Expense> months = new ArrayList<>();

    for(Expense e: expenses){
        if(e.getExpenseMonth().equals(month)){

            months.add(e);
        }
   }
  }

  }

    

