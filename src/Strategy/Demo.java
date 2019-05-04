package Strategy;

public class Demo {
    public static void main(String[] args) {
        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.performanceFly();
        redHeadDuck.performanceQuack();

        Duck woodenDuck = new WoodenDuck();
        woodenDuck.performanceFly();
        woodenDuck.performanceQuack();
    }
}
