package Decorator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.CASE_INSENSITIVE;

public class Espreso extends Coffee {

    public Espreso() {
        description = "Espreso";
    }

    @Override
    public double cost() {
        return 1.3;
    }

    public static void main(String[] args) {
        Pattern p = Pattern.compile("java", CASE_INSENSITIVE);
        Matcher m = p.matcher("java, Java, JavAs, JaVa");
        String res = m.replaceAll("java");
        System.out.println("res = " + res);
    }
}
