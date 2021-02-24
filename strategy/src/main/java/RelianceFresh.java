

public class RelianceFresh extends GroceryStore {

    public RelianceFresh() {
        billingStrategy = new ScanBilling();
        paymentStrategy = new UpiPayment();
    }

    public void catalog() {
        System.out.println("Reliance Fresh Catalogue!!");
    }

}
