import java.util.ArrayList;
import java.util.List;

public class FinanceManager {

    List<Expense> expenses = new ArrayList<>();
    List<Income> incomes = new ArrayList<>();

    // adds an expense to list
    
    public void addExpense(Expense expense){
         
        expenses.add(expense);
    }
    public void addIncome(Income income){
    incomes.add(income);
    }

    // remove an expense from the list

  public void removeExpense(Expense expense){

    expenses.remove(expense);

  }
  public void removeIncome(Income income){
    incomes.remove(income);
  }

  public List<Expense> expensesByMonth(String month){
    List <Expense> months = new ArrayList<>();

    for(Expense e: expenses){
        if(e.getExpenseMonth().equals(month)){
            months.add(e);
        }
   }
   return months;
  }
 public List<Income> incomeByMonth(String month){
  List<Income> months = new ArrayList<>();

  for(Income i:incomes){
    if(i.getMonth().equals(month)){
      months.add(i);
    }
  }
  return months;
 }
  public double totalExpensesAmtByMonth(String month){
    List<Expense> m = expensesByMonth(month);
double sum = 0;
    for(Expense e:m){
      sum+=e.getAmount();
    }
    return sum;
  }

  public double avgExpensesAmtByMonth(String month){
  List <Expense> m = expensesByMonth(month);  
double sum = 0;
double length = m.size();
if(m.isEmpty()){
  return 0.0;
}
 for(Expense e: m){
    sum +=e.getAmount();
      }
       return sum/length;
   }

     
  }

  
  




    

