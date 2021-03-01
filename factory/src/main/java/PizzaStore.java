public abstract class PizzaStore {

    abstract Pizza createPizza(String pizzaType);

    Pizza orderPizza(String pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }


}
