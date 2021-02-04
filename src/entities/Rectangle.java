package entities;

public class Rectangle {

    public double widht;
    public double height;


    public double area() {
        return widht * height;
    }

    public double perimeter () {
        return (widht * 2) + (height * 2);
    }


        public double diagonal(){
        return Math.sqrt(Math.pow(widht, 2) + Math.pow(height, 2));
    }

        public String toString(){
        return "AREA = "
            + String.format("%.2f", area())
            + "\nPERIMETER = "
            + String.format("%.2f", perimeter())
            + "\nDIAGONAL = "
            + String.format("%.2f", diagonal());
    }

}
