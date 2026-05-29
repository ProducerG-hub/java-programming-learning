package personal;

abstract class Payment{
    private double amount;

    Payment(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void processPayment();
    public abstract void displayReceipt();
}

class MobilePayment extends Payment{
    MobilePayment(){
        super(50000);
    }

    @Override
    public void displayReceipt() {
        String type = "Mobile Payment";
        String status = "PAID";

        System.out.println("======================== RECEIPT =========================");
        System.out.println("Payment: "+type);
        System.out.println("Amount: "+getAmount());
        System.out.println("Status: "+status);
        System.out.println("=================================================");
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Mobile Money Payment .........");
        System.out.println("Amount: "+getAmount());
        System.out.println("=================================================");
        displayReceipt();
    }


}

class CardPayment extends Payment{
    CardPayment(){
        super(80000);
    }

    @Override
    public void displayReceipt() {
        String type = "Card Payment";
        String status = "PAID";

        System.out.println("======================== RECEIPT =========================");
        System.out.println("Payment: "+type);
        System.out.println("Amount: "+getAmount());
        System.out.println("Status: "+status);
        System.out.println("=================================================");
    }

    @Override
    public void processPayment(){
        System.out.println("Processing Card Payment .........");
        System.out.println("Amount: "+getAmount());
        System.out.println("=================================================");
        displayReceipt();
    }

}

class BankTransfer extends Payment{
    BankTransfer(){
        super(100000);
    }

    @Override
    public void displayReceipt() {
        String type = "Bank Transfer";
        String status = "PAID";

        System.out.println("======================== RECEIPT =========================");
        System.out.println("Payment: "+type);
        System.out.println("Amount: "+getAmount());
        System.out.println("Status: "+status);
        System.out.println("=================================================");
    }


    @Override
    public void processPayment(){
        System.out.println("Processing Bank Transfer .........");
        System.out.println("Amount: "+getAmount());
        System.out.println("=================================================");
        displayReceipt();
    }

}

public class Abstraction {
    public static void main(String[] args) {
        MobilePayment p1 = new MobilePayment();
        CardPayment p2 = new CardPayment();
        BankTransfer p3 = new BankTransfer();
        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}
