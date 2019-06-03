package Decorator;

public class Mocha extends CondimentDecorator {
    Coffee coffee;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.6;
    }
}
