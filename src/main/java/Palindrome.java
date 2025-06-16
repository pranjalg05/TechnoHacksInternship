import java.util.Scanner;

public class Palindrome {
    static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        if(str.equals(reverse(str)))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
