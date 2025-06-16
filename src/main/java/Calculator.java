import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    static double add(double a, double b){
        return a+b;
    }

    static double sub(double a, double b){
        return a-b;
    }

    static double mul(double a, double b){
        return a*b;
    }

    static double div(double a, double b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = in.nextInt();
        System.out.println("Enter the second number: ");
        int b = in.nextInt();
        System.out.println("Addition: " + add(a,b));
        System.out.println("Subtraction: " + sub(a,b));
        System.out.println("Multiplication: " + mul(a,b));
        System.out.printf("Division: " + div(a,b));
    }
}
