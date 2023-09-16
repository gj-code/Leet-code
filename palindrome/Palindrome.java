import java.util.Scanner;

public class Palindrome {
    
    public static void main(String[] args){
        System.out.println("PLease Enter an integer number: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean y = isPalindrome(x);
        System.out.println(y);
    }

    public static boolean isPalindrome(int x) {
        String reverseStr = "";
        String str = String.valueOf(x);
        for(int i = str.length()-1; i >= 0; i--){
            reverseStr += str.charAt(i);
        }
        System.out.println(reverseStr);
        
        return reverseStr.equals(str);
    }
}