package Lowest_Level_Class;

import Intermediate_Class.Bunny;

public class Bank_manager extends Bunny {

    double loan_amount;
    public Bank_manager(String size){
        super(size,"Black");
        this.job="Bank Manager";
    }

    public double getLoanAmount(){
        return loan_amount;
    }
    public void setLoan_amount(double amount){
        this.loan_amount=amount;
    }
    public void authorize_loan(){
        System.out.println("Loan amount authorized "+getLoanAmount());
    }

}
