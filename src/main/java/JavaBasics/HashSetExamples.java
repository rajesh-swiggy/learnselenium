package JavaBasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) {
        HashSet<String> values = new HashSet<>();

        values.add("Selenium");
        values.add("QTP");
        values.add("Winium");
        values.add("1");
        values.add("Rajesh");
        values.add("abc");

        System.out.println(values);


        for(String e : values)
        {
            System.out.println(e);
        }

        ArrayList<String> list = new ArrayList<>(values);
        System.out.println("4th value from Array List : " + list.get(3));
    }
}
