package Factory.AbstractFactory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("name = " + name);
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }
    void box() {
        System.out.println("place pizza into box");
    }
}
