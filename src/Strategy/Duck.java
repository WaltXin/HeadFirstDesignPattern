package Strategy;

public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    Duck() {
    }

    public void swim() {
        System.out.println("I can swim");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performanceFly() {
        flyBehavior.fly();
    }

    public void performanceQuack() {
        quackBehavior.quack();
    }

    public void display() {
        System.out.println("I am duck");
    }
}
