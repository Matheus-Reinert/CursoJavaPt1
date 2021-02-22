package application;

import java.text.ParseException;
import java.util.Scanner;

import static util.All.*;

public class Main {


    public static void main(String[] args) throws ParseException {

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
        System.out.println("11 - Hotel");
        System.out.println("12 - List");
        System.out.println("13 - Employee List");
        System.out.println("14 - Matriz");
        System.out.println("15 - Exercício Matriz");
        System.out.println("16 - Date");
        System.out.print("Choose an option my friend: ");
        int opc = sc.nextInt();

        switch (opc) {

            case 1 -> triangleArea();
            case 2 -> employeeOO();
            case 3 -> staticMembers();
            case 4 -> rectangleOO();
            case 5 -> stock();
            case 6 -> studentOO();
            case 7 -> triangleOO();
            case 8 -> bank();
            case 9 -> heightVector();
            case 10 -> productsAverage();
            case 11 -> hotel();
            case 12 -> list();
            case 13 -> employeeList();
            case 14 -> matriz();
            case 15 -> exerMatriz();
            case 16 -> date();

            default -> System.out.println();

        }
    }
}



