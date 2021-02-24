

public class AmazonFresh extends GroceryStore{

    public AmazonFresh() {
        billingStrategy = new ManualBilling();
        paymentStrategy = new CardPayment();
    }

    public void catalog() {
        System.out.println("Amazon Fresh Catalogue!!");
    }

}
