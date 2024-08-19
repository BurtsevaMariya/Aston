package Lesson_11;

public class Bowl {
    private int food;//кол-во еды в миске

    //инициализирую кол-во еды в миске
    Bowl(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
    //добавление еды
    public void addFoodBowl(int amount) {
        if (amount > 0) {
            this.food = this.food + amount;
        }
    }

    //уменьшить кол-во еды, если еды недостаточно, возвращаем false
    public boolean decreaseFood(int amount) {
        if (amount > 0 && this.food >= amount) {
            this.food -= amount;
            return true;
        } else {
            return false;
        }
    }
}