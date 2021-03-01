public class Runner {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("cheese");

        System.out.println("----------Second Pizza-------------");
        PizzaStore otherStore = new ChicagoPizzaStore();
        otherStore.orderPizza("farmhouse");

    }
}
