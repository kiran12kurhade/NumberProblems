import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int digits=sc.nextInt();
        int sum=0;
        int num=0;
        while(digits !=0){
             sum=digits%10;
             num=num+sum;
          //  sum=sum+sum;
            digits=digits/10;
        }
        System.out.println(num);
    }
}
