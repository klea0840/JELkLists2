package task2Animals;

// Используем класс Zoo2
public class Main2 {

    public static void main(String[] args) {

        Zoo2 zoo = new Zoo2();

        for (String a: zoo.getZooAnimals()) {
            System.out.println(a);
        }
    }
}
