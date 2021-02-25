public class Olive extends PizzaDecorator {

    public Olive(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Olive";
    }

    @Override
    public double price() {
        return 30.0 + pizza.price();
    }
}
