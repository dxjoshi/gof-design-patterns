public class FruitMilkShake extends MilkShakeTemplate {

    public void addBaseIngredients() {
        System.out.println("Adding fresh fruits");
    }

    public void addToppings() {
        System.out.println("Adding toppings");
    }

    @Override
    public boolean needToppings() {
        return false;
    }
}
