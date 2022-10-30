package class22;

public class task2 {

}
class CreditCard {
    double balance;
    double interest;

    CreditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    void calculateInterest() {

        double interestAmount = interest * balance / 100;
        System.out.println("interest amount ="+interestAmount);
    }
}
class Visa extends CreditCard{
Visa (double balance,double interest){
    super(balance,interest);
}

@Override
    void calculateInterest(){
    double interestAmount=interest*balance/100;
    System.out.println();
    System.out.println("interest amount ="+(interestAmount+5));
}
}
class AX extends CreditCard{
    AX (double balance,double interest){
        super(balance,interest);
    }

    @Override
    void calculateInterest(){
        double interestAmount=interest*balance/100;
        System.out.println();
        System.out.println("interest amount ="+(interestAmount+10));
    }
}