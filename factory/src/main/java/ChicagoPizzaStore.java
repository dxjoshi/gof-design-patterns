public class ChicagoPizzaStore  extends PizzaStore{

    @Override
    Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equalsIgnoreCase(pizzaType)) {
            pizza = new ChicagoCheesePizza();
        } else if ("farmhouse".equalsIgnoreCase(pizzaType)) {
            pizza = new ChicagoFarmhousePizza();
        } else if ("classic".equalsIgnoreCase(pizzaType)) {
            pizza = new ChicagoClassicPizza();
        }
        return pizza;
    }
}
