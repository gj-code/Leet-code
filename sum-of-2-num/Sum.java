import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Please provide 2 numbers: ");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println("Sum: " + (a + b)); 
    }
}