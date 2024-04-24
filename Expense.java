// expense class represeting individual expense , encapsulates the data with each expense

import java.sql.Date;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Expense {

    String expenseMonth;
    String description,name,paymentMethod;
    double amount;
   

    Expense(String expenseMonth,double amount,String name,String description){
        this.expenseMonth=expenseMonth;
        this.description = description;
        this.amount = amount;
        this.name = name;
        
    }

    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
   
    public String getExpenseMonth(){
        return expenseMonth;
    }
    public double getAmount(){
        return amount; 
    }
    
    }

