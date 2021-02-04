package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class StudentOO {
    public static void main(String[] args) {

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
}
