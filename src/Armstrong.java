import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rem=0;
        int result=0;
        int n=0;
        int original=num;
        while (num != 0) {
            num=num/10;
            n++;
        }
        num=original;

        while (num !=0){
            rem=num%10;
            result=result+(int)(Math.pow(rem,n));
            num=num/10;
        }

        if(result==original){
            System.out.println(num+" is Armstrong number");
        }
        else{
            System.out.println(num+" is Not Armstrong number");
        }
    }
}
