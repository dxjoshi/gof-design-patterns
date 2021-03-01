public class NYPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equalsIgnoreCase(pizzaType)) {
            pizza = new NYCheesePizza();
        } else if ("farmhouse".equalsIgnoreCase(pizzaType)) {
            pizza = new NYFarmhousePizza();
        } else if ("classic".equalsIgnoreCase(pizzaType)) {
            pizza = new NYClassicPizza();
        }
        return pizza;
    }

}
