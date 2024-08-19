package Lesson_11;

public class Animal {
    static int countAnimals = 0;

    Animal() {
        countAnimals++;
    }

    public void runAnimal(int distance) {
        System.out.println("Животное пробежало " + distance + "м.");
    }

    public void swimAnimal(int distance) {
        System.out.println("Животное проплыло " + distance + "м.");
    }

    public static void printCountAnimals() {
        System.out.println("Создано животных " + countAnimals);
    }
}