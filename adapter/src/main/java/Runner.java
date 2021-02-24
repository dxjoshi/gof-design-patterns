public class Runner {
    public Runner() {
    }

    public void test(IDuck subject) {
        subject.quack();
        subject.fly();
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        System.out.println("--------Testing the Mallard duck----------");
        IDuck duck = new MallardDuck();
        runner.test(duck);

        System.out.println("--------Testing the Wild turkey----------");
        IPenguin penguin = new EmperorPenguin();
        IDuck penguinAdapter = new PenguinAdapter(penguin);
        runner.test(penguinAdapter);

    }
}
