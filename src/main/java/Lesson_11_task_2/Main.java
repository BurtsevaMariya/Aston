package Lesson_11_task_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red", "Yellow");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Green", "Blue");
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Black", "Orange");

        printShapeDetails(circle);
        printShapeDetails(rectangle);
        printShapeDetails(triangle);
    }

    public static void printShapeDetails(Shape shape) {
        System.out.println("Периметр: " + shape.calculatePerimeter());
        System.out.println("Площадь: " + shape.calculateArea());
        System.out.println("Цвет границы: " + shape.getBorderColor());
        System.out.println("Цвет заливки: " + shape.getFillColor());
        System.out.println();
    }
}

