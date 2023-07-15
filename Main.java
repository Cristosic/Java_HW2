package scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String a = s.nextLine();
        if (a.length() % 2 != 0) System.out.println("The string should be even");
        System.out.println("Enter the second string: ");
        String b = s.nextLine();
        if (a.length() % 2 != 0) System.out.println("The string should be even");
        System.out.println(a.substring(0, a.length() / 2) + b.substring(b.length() / 2));


    }

    public static void math1(String[] args) {

        Scanner num = new Scanner(System.in);
        float first,second, result;
        System.out.println("Enter first num");
        first = num.nextFloat();
        System.out.println("Enter second num");
        second = num.nextFloat();
        result = first - second;
        System.out.println("Result is - " + result);

    }

    public static void math2(String[] args) {

        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.println("Enter first num");
        first = num.nextInt();
        System.out.println("Enter second num");
        second = num.nextInt();
        result = first + second;
        System.out.println("Result is - " + result);
    }

    public static void math3(String[] args) {

        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.println("Enter first num");
        first = num.nextInt();
        System.out.println("Enter second num");
        second = num.nextInt();
        result = first * second;
        System.out.println("Result is - " + result);
    }

    public static void math4(String[] args) {

        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.println("Enter first num");
        first = num.nextInt();
        System.out.println("Enter second num");
        second = num.nextInt();
        result = first / second;
        System.out.println("Result is - " + result);
    }

}