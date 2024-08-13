package lesson_8;

public class Park {

    public class Attraktsion {
        private final String name;
        private final String workTime;
        private final int cost;

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
}