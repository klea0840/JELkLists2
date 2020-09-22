package iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(5);
        myList.add(2);
        myList.add(2);

        ListIterator<Integer> myIterator = myList.listIterator();

        // В задании сказано, что надо увеличить все элементы на 1. Я думаю,
        // что надо увеличить их и *положить* обратно в массив.

        Integer temp; // переменная для хранения значения, на которое указывает итератор
        while(myIterator.hasNext()) {
            temp = myIterator.next(); // получаем значение переменной
            myIterator.set(temp + 1); // увеличиваем на 1 и сохраняем
            // ListIterator.set() кладет значение вместо последнего элемента, который он вернул
        }

        // Печатаем массив
        for (Integer i: myList) {
            System.out.println(i);
        }
    }


}
