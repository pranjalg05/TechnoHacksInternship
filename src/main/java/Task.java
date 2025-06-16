import java.math.BigInteger;
import java.util.Scanner;

public class Task {

    static BigInteger factorial(int n){
        if(n==0)
            return BigInteger.ONE;
        else
            return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println("Factorial of " + n + " = " +  factorial(n));
    }
}
