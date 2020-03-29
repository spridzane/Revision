package Revision;

public class Box {
    double width;
    double height;
    double length;

    //constructor
    public Box(){
        width = 10;
        height = 10;
        length = 5;
    }
    //constructor with parameters
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double compute(){
        return width * height * length;
    }


}
