import java.util.Scanner;
import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args){

        // nested loop = A loop inside another loop
        //              Used often with matrices or DS&A

        // for(int j=1; j<=3; j++) {
        //     for(int i=1; i<=9; i++){
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        // }

        Scanner scanner = new Scanner(System.in);

        int rows;
        int cols;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of cols: ");
        cols = scanner.nextInt();

        System.out.print("Enter pattern: ");
        symbol = scanner.next().charAt(0);

        for(int j=0; j<rows; j++){
            for(int i=0; i<cols; i++){
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

        scanner.close();


    }

}