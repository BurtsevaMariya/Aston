package Lesson_11_task_2;

class Rectangle implements Shape {
    private double width;
    private double height;
    private String borderColor;
    private String fillColor;

    Rectangle(double width, double height, String borderColor, String fillColor) {
        this.width = width;
        this.height = height;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String getBorderColor() {
        return this.borderColor;
    }

    @Override
    public String getFillColor() {
        return this.fillColor;
    }
}