package util;

import entities.*;

import java.util.Locale;
import java.util.Scanner;

public class All {

    public static void areaTriangulo() {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();

        sc.close();
    }

    public static void EmployeeOO(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee em = new Employee();

        System.out.print("Name: ");
        em.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        em.salary = sc.nextDouble();
        System.out.print("Tax: ");
        em.tax = sc.nextDouble();

        System.out.println(em);

        System.out.print("Which percentage to increse salary? ");
        double percentage = sc.nextDouble();
        em.increaseSalary(percentage);

        System.out.println(em);

        sc.close();
    }

    public static void MembrosEstaticos(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI Value: %.2f\n", Calculator.PI);

    }

    public static void RectangleOO(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.widht = sc.nextDouble();

        rectangle.height = sc.nextDouble();
        System.out.println(rectangle);


        sc.close();

    }

    public static void Stock(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        System.out.println("Product Data: " + product);

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();

    }

    public static void StudentOO(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("Nota 1: ");
        student.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        student.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        student.nota3 = sc.nextDouble();

        System.out.println(student);

        sc.close();

    }

    public static void TriangleOO(){

        Scanner sc = new Scanner(System.in);
        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f\n", areaX);
        System.out.printf("Triangle Y area: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

    }
}

