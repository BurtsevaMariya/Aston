package Lesson_11;

public class Main {
    public static void main(String[] args) {
        Dog dogKukla = new Dog();
        dogKukla.runAnimal(19);
        dogKukla.swimAnimal(9);

        Cat catPushistik = new Cat();
        catPushistik.runAnimal(10);
        catPushistik.swimAnimal(8);

        Animal.printCountAnimals();
        Dog.printCountDogs();
        Cat.printCountCats();

        Bowl bowl = new Bowl(20);  // создаем миску с 20 единицами еды
        Cat[] cats = {new Cat(), new Cat(), new Cat()};  // создаем массив из трех котов

        for (Cat cat : cats) {
            boolean result = cat.eat(bowl, 10);  // каждый кот пытается съесть 10 единиц еды
            if (result) {
                System.out.println("Кот поел и стал сытым.");
            } else {
                System.out.println("Коту не хватило еды.");
            }
        }

        for (Cat cat : cats) {
            System.out.println("Кот сыт: " + cat.isFull());
        }
    }
}