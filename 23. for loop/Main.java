import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // for loop = execute some code a CERTAIN amount of times

        // for (int i = 0; i < 10; i++) {
        //     System.out.println(i);
        // }

        // for (int i=10; i>0; i--) {
        //     System.out.println(i);
        // }

        // for(int i=0; i<10; i+=2){
        //     System.out.println(i);
        // }

        // for(int i=10; i>0; i-=2){
        //     System.out.println(i);
        // }

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter how many time you want to loop: ");
        // int max = scanner.nextInt();

        // for(int i=0; i<max; i++){
        //     System.out.println(i);
        // }

        // scanner.close();

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to count down from: ");
        int start = scanner.nextInt();
        
        for(int i=start; i>0; i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

        System.out.println("HAPPY NEW YEAR!");

        scanner.close();

    }

}