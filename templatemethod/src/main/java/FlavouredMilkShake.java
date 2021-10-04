public abstract class MilkShakeTemplate {

    public void makeAwesomeShake() {
        addMilk();
        addBaseIngredients();
        shakeIt();
        if (needToppings()) {
            addToppings();
        }
    }

    public abstract void addBaseIngredients();
    public abstract void addToppings();

    private void addMilk() {
        System.out.println("Adding Milk");
    }

    private void shakeIt() {
        System.out.println("Shaking it!!");
    }

    public boolean needToppings() {
        return true;
    }

}
