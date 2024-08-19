package Lesson_11;


public class Dog extends Animal {

    static int countDogs = 0;

    Dog() {
        countDogs++;
    }

    @Override
    public void runAnimal(int distance) {
        if (distance <= 500) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать больше 500 м.");
        }
    }

    @Override
    public void swimAnimal(int distance) {
        if (distance <= 10) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть больше 10 м.");
        }
    }

    public static void printCountDogs() {
        System.out.println("Создано собак: " + countDogs);
    }
}