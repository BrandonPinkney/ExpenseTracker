// expense class represeting individual expense , encapsulates the data with each expense

import java.sql.Date;

public class Expense {

    String expenseMonth;
    String description,category,paymentMethod;
    double amount;
   

    Expense(String expenseMonth,double amount,String category,String description,String paymentMethod){
        this.expenseMonth=expenseMonth;
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.paymentMethod = paymentMethod;
    }

    public String getDescription(){
        return description;
    }
    public String getCategiory(){
        return category;
    }
    public String getPaymentMethod(){
        return paymentMethod;
    }
    public String getExpenseMonth(){
        return expenseMonth;
    }
    public double getAmount(){
        return amount; 
    }
    
    }

