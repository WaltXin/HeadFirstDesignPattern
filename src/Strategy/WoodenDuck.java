package Strategy;

public class WoodenDuck extends Duck {
    WoodenDuck() {
        display();
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("I am a wooden duck");
    }
}
