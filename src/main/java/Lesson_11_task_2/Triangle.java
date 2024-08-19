package Lesson_11_task_2;

class Triangle implements Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String borderColor;
    private String fillColor;

    Triangle(double sideA, double sideB, double sideC, String borderColor, String fillColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.borderColor = borderColor;
        this.fillColor = fillColor;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
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