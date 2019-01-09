package JavaBasics;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> values = new LinkedHashSet<>();
        values.add("Selenium");
        values.add("QTP");
        values.add("Winium");
        values.add("xyz");
        values.add("1");
        values.add("Rajesh");
        values.add("abc");

        System.out.println(values);
    }
}
