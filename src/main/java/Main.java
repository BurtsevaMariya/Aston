
import java.util.List;

public class Main {

    public static void main(String[] args) {

        UniqueWord.wordUnique();

        Phone phone = new Phone();
        phone.add("Иванов", "+7 123-111-964-11");
        phone.add("Киров", "+7 234-222-572-22");
        phone.add("Клюкин", "+7 345-333-376-33");
        phone.add("Петров", "+7 678-444-220-44");
        phone.add("Столов", "+7 355-555-376-55");
        phone.add("Тарелкин", "+7 644-666-220-66");

        //Задание № 2
        List<String> numberOfIvanov = phone.get("Иванов");
        System.out.println("Номер Ивановa: " + numberOfIvanov);

        List<String> numberOfKirov = phone.get("Киров");
        System.out.println("Номера Кирова: " + numberOfKirov);

        List<String> numberOfKlykin = phone.get("Клюкин");
        System.out.println("Номера Клюкина: " + numberOfKlykin);

        List<String> numberOfPetrov = phone.get("Петров");
        System.out.println("Номера Петрова: " + numberOfPetrov);

        List<String> numberOfStolov = phone.get("Столов");
        System.out.println("Номера Столова: " + numberOfStolov);
    }
}