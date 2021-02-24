public class PenguinAdapter implements IDuck {
    IPenguin penguin;
    public PenguinAdapter(IPenguin penguin) {
        this.penguin = penguin;
    }

    public void quack() {
        penguin.gak();
    }

    public void fly() {
        penguin.noFly();
    }
}
