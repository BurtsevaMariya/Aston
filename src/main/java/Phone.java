import java.util.*;

public class Phone {

    private final Map<String, List<String>> phone;

    public Phone() {
        phone = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        if (phone.containsKey(surname)) {
            phone.get(surname).add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phone.put(surname, numbers);
        }
    }

    public List<String> get(String surname) {
        return phone.get(surname);
    }

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.add("Иванов", "+7 123-111-964-11");
        phone.add("Киров", "+7 234-222-572-22");
        phone.add("Клюкин", "+7 345-333-376-33");
        phone.add("Петров", "+7 678-444-220-44");

        System.out.println("Иванов: " + phone.get("Иванов"));
        System.out.println("Киров: " + phone.get("Киров"));
        System.out.println("Клюкин: " + phone.get("Клюкин"));
    }
}