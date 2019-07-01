package Factory.AbstractFactory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
