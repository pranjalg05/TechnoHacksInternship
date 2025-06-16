import java.util.Scanner;

public class FibonacciTask {

    static void fibonacci(int a, int b, int n){
        if(n==0)
            return;
        else{
            int c = a+b;
            System.out.print(c + " ");
            fibonacci(b,c,n-1);
        }
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println("Enter the value of n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() - 2;
        System.out.print(a + " " + b + " ");
        fibonacci(a,b,n);
    }
}
