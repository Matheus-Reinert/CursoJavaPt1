package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeOO {
    public static void main(String[] args) {


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
}
