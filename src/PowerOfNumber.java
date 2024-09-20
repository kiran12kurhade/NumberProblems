import java.util.Scanner;

public class PowerOfNumber {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter the power");
        int power = sc.nextInt();
        System.out.println(Math.pow(n, power));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter the power");
        int power = sc.nextInt();
        int num=1;
        for(int i = 1; i <= power; i++){
           num = num*n;
        }
        System.out.println(num);
    }
}
