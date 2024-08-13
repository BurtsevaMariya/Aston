package lesson_8;

public class MainPark {

    public static void main(String[] args) {

        Park park = new Park();

        Park.Attraktsion attraktsion1 = park.new Attraktsion("Колесо обозрения", "10:00 - 22:00", 200);
        Park.Attraktsion attraktsion2 = park.new Attraktsion("Американские горки", "11:00 - 20:00", 300);

        attraktsion1.printInfo();
        System.out.println();
        attraktsion2.printInfo();
    }
}
