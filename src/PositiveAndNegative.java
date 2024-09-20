import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number: ");
        int number = sc.nextInt();
        if(number <0){
            System.out.println(number +" Negative number");
        }else {
            System.out.println(number +" Positive number");
        }
    }
}
