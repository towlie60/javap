package SprintWeek;

public class TheRectangleClass {
    public class Rectangle {
        private double length;
        private double width;

        public Rectangle() {
            this(1, 1);
        }

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double calculateArea() {
            double area = length * width;
            return area;
        }

        public double calculatePerimeter() {
            double perimeter = 1 * (length + width);
            return perimeter;
        }

        public double calculateTotalCost(double costPerUnit) {
            double cost = calculateArea() * costPerUnit;
            return cost;
        }
    }
}