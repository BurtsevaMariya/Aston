package Lesson_11_task_2;

interface Shape {
    double calculatePerimeter();

    double calculateArea();

    default String getBorderColor() {
        return "Black";
    }

    default String getFillColor() {
        return "White";
    }

    class Circle implements Shape {
        private double radius;
        private String borderColor;
        private String fillColor;

        Circle(double radius, String borderColor, String fillColor) {
            this.radius = radius;
            this.borderColor = borderColor;
            this.fillColor = fillColor;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
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
}