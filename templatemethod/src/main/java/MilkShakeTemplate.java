public abstract class MilkShakeTemplate {

    public void makeAwesomeShake() {
        addMilk();
        addBaseIngredients();
        shakeIt();
        if (needToppings()) {           // This is a hook method
            addToppings();
        }
    }

    // abstract methods follow Hollywood Principle: MilkShakeTemplate(high-level class) will call implementations of these method like in FruitMilkShake and FlavouredMilkShkae(low-level)
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
