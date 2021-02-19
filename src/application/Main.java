package application;

import java.util.Scanner;

import static util.All.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Triangle area without OO ");
        System.out.println("2 - EmployeeOO ");
        System.out.println("3 - Static Members");
        System.out.println("4 - RectangleOO");
        System.out.println("5 - Stock");
        System.out.println("6 - StudentOO");
        System.out.println("7 - TriangleOO");
        System.out.println("8 - Bank");
        System.out.println("9 - Heights");
        System.out.println("10 - Products Average: ");
        System.out.print("Choose an option my friend: ");
        int opc = sc.nextInt();

        switch (opc) {
            case 1 -> triangleArea();
            case 2 -> EmployeeOO();
            case 3 -> staticMembers();
            case 4 -> RectangleOO();
            case 5 -> Stock();
            case 6 -> StudentOO();
            case 7 -> TriangleOO();
            case 8 -> Bank();
            case 9 -> heightVector();
            case 10 -> productsAverage();
            default -> System.out.println();
        }
    }
}



