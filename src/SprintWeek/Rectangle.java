package SprintWeek;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {

        this.width = 0;
        this.height = 0;

    }

    public Rectangle(double x, double y, double width, double height) {

      //  super(x,y);

        this.width = width;
        this.height = height;

    }

    public double getHeight() {

        return height;

    }

    public double getWidth() {

        return width;

    }


    public void setHeight(double height) {

        this.height = height;

    }

    public void setWidth(double width) {

        this.width = width;

    }


    double getArea() {

        return (height*width);
    }


    double getPerimeter() {

        return 2*(height+width);
    }


    public String toString() {

        return "\nRectangle :\n Hieght = "+height+", Width = "+width+", Area = "+getArea()+", Perimeter = "+getPerimeter();

    }


}

