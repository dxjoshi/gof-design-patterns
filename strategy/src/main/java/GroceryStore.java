

public abstract class GroceryStore {

    IBilling billingStrategy;
    IPayment paymentStrategy;

    abstract void catalog();

    public GroceryStore() { }

    public void generateBill(){
        billingStrategy.generateBill();
    }

    public void processPayment() {
        paymentStrategy.processPayment();
    }

    public void shop() {
        catalog();
        System.out.println("Begin shopping!!");
        generateBill();
        processPayment();
    }


}
