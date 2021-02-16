package application;

import java.util.Scanner;

import static util.All.*;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Area Triangulo sem OO ");
        System.out.println("2 - EmployeeOO ");
        System.out.println("3 - Membros Estaticos");
        System.out.println("4 - RectangleOO");
        System.out.println("5 - Stock");
        System.out.println("6 - StudentOO");
        System.out.println("7 - TriangleOO");
        System.out.print("Escolhe uma aí: ");
        int opc = sc.nextInt();

        switch (opc) {
            case 1 -> areaTriangulo();
            case 2 -> EmployeeOO();
            case 3 -> MembrosEstaticos();
            case 4 -> RectangleOO();
            case 5 -> Stock();
            case 6 -> StudentOO();
            case 7 -> TriangleOO();
            default -> System.out.println();
        }
    }
}



