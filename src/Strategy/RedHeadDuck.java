package Strategy;

public class RedHeadDuck extends Duck {
    RedHeadDuck() {
        display();
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    public void display() {
        System.out.println("I am red head duck");
    }

}
