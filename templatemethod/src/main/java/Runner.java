public class Runner {
    public static void main(String[] args) {
        MilkShakeTemplate fruitShake = new FruitMilkShake();
        MilkShakeTemplate flavouredShake = new FlavouredMilkShake();
        fruitShake.makeAwesomeShake();
        flavouredShake.makeAwesomeShake();

    }
}
