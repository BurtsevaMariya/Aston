package aston;

public class FirstTask {
    private static int sum;

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(1, 2);
        printColor(101);
        compareNumbers(2, 2);
        System.out.println(isSumInRange(20, 1));
        isNumberPositiveOrNegative(-1);
        System.out.println(isNumberPositiveOrNegative(-1));
        printTextConsole("Печать", 3);
        System.out.println(isYearLeap(40));
        invertArray();
        loopThroughArray();
        changeValueArray();
        isDiagonalIndexesArray();
        returnOneDimensionalArray();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        System.out.println();
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumberPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Передали положительное число");
        } else {
            System.out.println("Передали отрицательное число");
        }
    }

    public static boolean isNumberPositiveOrNegative(int number) {
        return number >= 0;
    }

    public static void printTextConsole(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    public static boolean isYearLeap(int year) {
        if(year % 4 == 0 && year % 400 == 0){
            return true;
        }else return year % 100 == 0;
    }

    public static void invertArray (){
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++){
            if(array[i] == 0){
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static void loopThroughArray(){
        int[] array = new int[101];
        for(int i = 0; i < 101; i++){
            array[i] = i;
            System.out.println("index array[" + i + "] = " + array[i]);
        }
    }

    public static void changeValueArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.println("index array[" + i + "] = " + array[i]);
        }
    }

    public static void isDiagonalIndexesArray() {
        int[][] array = new int[8][8];

        for (int i = 0; i < array.length; i++) {
            array[i][array.length - i - 1] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][i] = 1;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void returnOneDimensionalArray() {
        int[] resultArray = createArray(5, 10);
        for (int i : resultArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}