package task3Animals2;

import task2Animals.Zoo2;

import java.util.ArrayList;

/**
 * Используем Zoo2, не копаясь в его "внутренностях". Мы обращаемся к нему
 * и содержащимся в нем данным только через заданные методы (конструктор и
 * getter).
 */
public class Main2 {

    public static void main(String[] args) {

        Zoo2 zoo = new Zoo2();

        ArrayList<String> zooAnimals = zoo.getZooAnimals();

        zooAnimals.remove(7);
        zooAnimals.remove(4);
        zooAnimals.remove(2);

        for (String a: zooAnimals) {
            System.out.println(a);
        }

        System.out.println("The size of the list is " + zooAnimals.size());

    }
}
