import java.util.Scanner;

public class GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first numbers: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second numbers: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third numbers: ");
        int n3 = sc.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+"is greater than "+n2 +"and "+n3);
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2+"is greater than "+n3 +"and "+n1);
        }
        else if(n3>n1 && n3>n2){
            System.out.println(n3+"is greater than "+n2 +"and "+n1);
        }
        else if(n1==n2 && n2==n3){
            System.out.println(n1+"and"+n2+"and"+n3+"are similar");
        }
    }
}
