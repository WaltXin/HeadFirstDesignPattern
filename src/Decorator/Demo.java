package Decorator;

public class Demo {
    public static void main(String[] args) {
        Coffee espreso = new Espreso();
        espreso = new Milk(espreso);
        espreso = new Mocha(espreso);
        System.out.println(espreso.getDescription() + " €" + espreso.cost());

        Coffee darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + " €" + darkRoast.cost());
    }
}
