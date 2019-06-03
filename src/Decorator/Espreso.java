package Decorator;

public class Espreso extends Coffee {

    public Espreso() {
        description = "Espreso";
    }

    @Override
    public double cost() {
        return 1.3;
    }
}
