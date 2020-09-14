package task2Animals;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<String> zoo = new ArrayList<>();

        zoo.add(0, "Lion");
        zoo.add(1, "Ostrich");
        zoo.add(2, "Rabbit");
        zoo.add(3, "Tiger");
        zoo.add(4, "Gorilla");
        zoo.add(5, "Zebra");
        zoo.add(6, "Elephant");
        zoo.add(7, "Lama");

        for (String z:
             zoo) {
            System.out.println(z);
        }

    }

}
