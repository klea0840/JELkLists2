package teachers;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Irina");
        teachers.add("Nelly");
        teachers.add("Elena");
        teachers.add("Aslan");
        teachers.add("Alla");

        for (String teacher : teachers) {
            System.out.println(teacher);
        }

//        System.out.println(teachers.get(0));
//        System.out.println(teachers.get(1));
//        System.out.println(teachers.get(2));
//        System.out.println(teachers.get(3));
//        System.out.println(teachers.get(4));

        System.out.println("The best teacher is under the index " + teachers.indexOf("Nelly"));
        System.out.println("The worst teacher was is under the index " + teachers.indexOf("Irina"));

    }
}
