package util;

import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class All {

    public static void triangleArea() {

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

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        em.increaseSalary(percentage);

        System.out.println(em);

        sc.close();
    }

    public static void staticMembers(){

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

        sc.close();

    }

    public static  void Bank(){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account number: ");
        int AccountNum = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Is there any deposit (y/n)");
        char opc = sc.next().charAt(0);

        Bank bank;

        if(opc == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank = new Bank(AccountNum, name, initialDeposit);
        }
        else {
            bank = new Bank(AccountNum, name);
        }

        System.out.println("\nAccount data: ");
        System.out.println(bank);

        System.out.print("\nEnter a deposit value: ");
        double deposit = sc.nextDouble();
        bank.depositValue(deposit);
        System.out.println("Update Account data: ");
        System.out.print(bank);

        System.out.print("\n\nEnter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bank.withdrawValue(withdraw);
        System.out.println("Update Account data: ");
        System.out.print(bank.toString());

        sc.close();
    }

    public static void heightVector() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of people: ");
        int n = sc.nextInt();
        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the height: ");
            vector[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vector[i];
        }

        double avg = sum / n;
        System.out.printf("Average: %.2f \n", avg);

        sc.close();
    }

    public static void productsAverage() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ProductsAverage[] vector = new ProductsAverage[n];

        for(int i = 0; i < vector.length; i++ ) {

            sc.nextLine();
            System.out.print("Enter the name of the Product: ");
            String name = sc.nextLine();
            System.out.print("Enter the price of the Product: ");
            double price = sc.nextDouble();
            vector[i] = new ProductsAverage(name, price);

        }

        double sum = 0.0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }
        double avg = sum / vector.length;

        System.out.printf("Average price = %.2f \n", avg);

        sc.close();
    }

    public static void hotel(){

        Scanner sc = new Scanner(System.in);

        Hotel[] vector = new Hotel[10];
        int roomNumber;
        String name;
        String email;

        System.out.print("Enter the number of People: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i ++) {

            System.out.print("Enter the room number: ");
            roomNumber = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the name: ");
            name = sc.nextLine();
            System.out.print("Enter the email: ");
            email = sc.nextLine();

            vector[roomNumber] = new Hotel(name, email);
        }

        for (int i = 0; i < vector.length; i ++ ){

            if(vector[i] != null){
                System.out.println("Room Number: " + i +
                        "\nName: " + vector[i].getName()
                        + "\nEmail: "+ vector[i].getEmail());
            }
        }

        sc.close();

    }

    public static void List () {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");

        //Add uma String na posiçao 2
        list.add(2, "Marco");

        //Imprime quantas posiçoes a lista possui
        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("-----------------------");

        list.remove(3);
        //Remove dado a partir da comparação de valores
        list.remove("Ana");
        //Remove todos iniciados com M
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("-----------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-----------------------");
        //Declara uma nova lista recebendo a lista original, filtra e devolve a lista nova
        //stream() aceita operações lambida
        //filter recebe predicado
        //colector converte stream para lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("-----------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }

}

