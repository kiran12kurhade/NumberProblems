import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int rev=0;
        int rem=0;
        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        int digit=rev-original;

        if (digit !=0) {
            System.out.println(original+"  is not a palindrome.");
        }
        else {
            System.out.println(original+"  is a palindrome.");
        }
    }
}
