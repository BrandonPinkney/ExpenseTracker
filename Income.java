// track income per month

public class Income {

    double amount;
    String source;
    String month;


    Income(double amount,String source,String month){
        this.amount=amount;
        this.source=source;
        this.month=month;
    }


    public double getAmount(){
        return amount;
    }
    public String getSource(){
        return source;
    }
    public String getMonth(){
        return month;
    }
}
