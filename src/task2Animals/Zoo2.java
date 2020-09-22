package task2Animals;

import java.util.ArrayList;

// В этом файле мы определяем логику работы класса. Пользоваться ею мы
// будем в классе Main.

public class Zoo2 {

    ArrayList<String> zooAnimals = new ArrayList<>();

    // Создание списка помещаем в конструктор
    // Так как конструктор мы будем использовать из другого пакета, то делаем
    // его public.
    public Zoo2() {
        zooAnimals.add(0, "Lion");
        zooAnimals.add(1, "Ostrich");
        zooAnimals.add(2, "Rabbit");
        zooAnimals.add(3, "Tiger");
        zooAnimals.add(4, "Gorilla");
        zooAnimals.add(5, "Zebra");
        zooAnimals.add(6, "Elephant");
        zooAnimals.add(7, "Lama");
    }

    // Getter
    public ArrayList<String> getZooAnimals() {
        return zooAnimals;
    }

    // Setter
    public void setZooAnimals(ArrayList<String> zooAnimals) {
        this.zooAnimals = zooAnimals;
    }
}
