package Lesson_11;

public class Cat extends Animal {
    private boolean isFull;//сытость
    static int countCats = 0;

    Cat() {
        countCats++;
        this.isFull = false;
    }

    @Override
    public void runAnimal(int distance) {
        if (distance <= 200) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать больше 200 м.");
        }
    }

    @Override
    public void swimAnimal(int distance) {
        System.out.println("Кот не умеет плавать.");
    }

    public static void printCountCats() {
        System.out.println("Создано котов: " + countCats);
    }

    public boolean eat(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            this.isFull = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return this.isFull;
    }

    public static void printCount() {
        System.out.println("Создано котов: " + countCats);
    }
}