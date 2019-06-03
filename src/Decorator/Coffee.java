package Decorator;

public abstract class Coffee {
    String description = "coffee";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
