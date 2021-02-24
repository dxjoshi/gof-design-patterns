

public class Runner {

    public static void main(String[] args) {
        System.out.println("----Shop with Amazon----");
        GroceryStore amz = new AmazonFresh();
        amz.shop();
        System.out.println("----Shop with Reliance----");
        GroceryStore rel = new RelianceFresh();
        rel.shop();
    }

}
