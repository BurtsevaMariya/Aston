package lesson_8;

public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraktsion {
        private String name;
        private String workTime;
        private int cost;

        public Attraktsion(String name, String workTime, int cost) {
            this.name = name;
            this.workTime = workTime;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Время работы: " + workTime);
            System.out.println("Стоимость: " + cost);
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Парк Горького");
        Park.Attraktsion attr1 = park.new Attraktsion("Колесо обозрения", "10:00 - 22:00", 200);
        Park.Attraktsion attr2 = park.new Attraktsion("Американские горки", "11:00 - 20:00", 300);

        attr1.printInfo();
        System.out.println();
        attr2.printInfo();
    }
}