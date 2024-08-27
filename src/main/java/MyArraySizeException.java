//обработка исключений связанных с размером массива
public class MyArraySizeException extends Exception {

    public MyArraySizeException(String message) {
        System.out.println("Подача массива другого размера.");
    }
}