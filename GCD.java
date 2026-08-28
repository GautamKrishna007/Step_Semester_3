import java.util.Scanner;
public class GCD {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        while (num2!=0){
            int rem = num1%num2;
            num1 = num2;   
            num2 = rem;
        }
        System.out.println("GCD is: " + num1);
    }}
