import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
         System.out.println("Please provide 2 numbers: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Sum is: " + (a + b) );
    }
}