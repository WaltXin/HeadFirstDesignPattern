package Decorator;

public class DarkRoast extends Coffee {

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
