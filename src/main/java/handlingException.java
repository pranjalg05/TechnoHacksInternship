import java.util.Scanner;

public class handlingException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Enter zero: ");
        int n = in.nextInt();
        System.out.println("Enter number greater than 4: ");
        int num = in.nextInt();

        try{
            int x = 50/n;
        }catch (ArithmeticException e){
            System.out.println("Error Division by zero not possible");
        }

        try {
            System.out.println(arr[num]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error Array index out of bounds");
        }
    }
}
