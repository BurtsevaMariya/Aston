package lesson_8;

public class Person {

    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private final int salary;
    private final int age;

    public Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Почта: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Ivanov Ivan", "Engineer", "test0@mail.ru", "89000000000", 10000, 18);
        personArray[1] = new Person("Ivanov Alex", "Engineer", "test1@mail.ru", "89111111111", 20000, 19);
        personArray[2] = new Person("Ivanov Liam", "Engineer", "test2@mail.ru", "89222222222", 30000, 20);
        personArray[3] = new Person("Ivanov Jacob", "Engineer", "test3@mail.ru", "89333333333", 40000, 30);
        personArray[4] = new Person("Ivanov Ethan", "Engineer", "test4@mail.ru", "89444444444", 50000, 40);

        for (Person person : personArray) {
            person.info();
            System.out.println();
        }
    }
}