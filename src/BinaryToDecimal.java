import java.util.Scanner;

public class BinaryToDecimal {
    public static void main1(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Binary Number: ");
        String binary = input.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("The decimal number is " + decimal);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Binary Number: ");
        String binary = input.nextLine();
        int base=1;
        int decimal=0;
        for(int i=binary.length()-1;i>=0;i--){
              if(binary.charAt(i)=='1') {
                  decimal = decimal + base;
              }
              base = base*2;

        }
        System.out.println("The decimal number is " + decimal);
    }
}
