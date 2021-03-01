public class ChicagoFarmhousePizza implements Pizza{

    private final String pizzaName = "ChicagoFarmhousePizza";

    @Override
    public void prepare() {
        System.out.println(String.format("Preparing %s!!", pizzaName));
    }

    @Override
    public void bake() {
        System.out.println(String.format("Baking %s!!", pizzaName));
    }

    @Override
    public void box() {
        System.out.println(String.format("Packing %s!!", pizzaName));
    }
}
