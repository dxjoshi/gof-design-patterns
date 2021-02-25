public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Cheese";
    }

    @Override
    public double price() {
        return 50.5 + pizza.price();
    }
}
