import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int n = sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(b+" ");
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        //System.out.println(c);


    }
}
