//обработка исключений связанных с неверными данными в массеве
public class MyArrayDataException extends Exception {

    public MyArrayDataException(String message) {
        System.out.println("Преобразование не удалось.");
    }
}
