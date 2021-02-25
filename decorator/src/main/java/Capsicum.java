public class Capsicum extends PizzaDecorator {

    public Capsicum(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Capcsicum";
    }

    @Override
    public double price() {
        return 25.5 + pizza.price();
    }
}
