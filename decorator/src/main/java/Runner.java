public class Runner {
    public static void main(String[] args) {
        // Trying to make a thin-crust Pizza with olives, capsicum, extra cheese!!

        Pizza pizza = new ThinCrust();
        pizza = new Olive(pizza);
        pizza = new Capsicum(pizza);
        pizza = new Cheese(pizza);
        System.out.println(String.format("%s [Total price: %s]",
                pizza.getDescription(), pizza.price()));
    }
}
