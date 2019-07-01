package Factory.AbstractFactory;

public class Demo {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.createPizza("cheese");
        System.out.println(pizza.name);

        pizza = chicagoStore.createPizza("cheese");
        System.out.println(pizza.name);
    }
}
