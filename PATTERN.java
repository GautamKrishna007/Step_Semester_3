import java.util.Scanner;
public class PATTERN{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows=scan.nextInt();
        for (int i=0;i<rows;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}