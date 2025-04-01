import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // while loop = repeat some code forever
        //              while some condition remains true

        // Scanner scanner = new Scanner(System.in);

        // String name = "";

        // while(name.isEmpty()){
        //     System.out.print("Enter your name: ");
        //     name = scanner.nextLine();
        // }

        // System.out.println("Hello " + name);

        // scanner.close();

        // INFINTE LOOP

        // while(1 == 1){
        //     System.out.println("HELP! I'M STUCK IN A LOOP");
        // }

        // Scanner scanner = new Scanner(System.in);

        // String response = "";

        // while(!response.equals("Q")){
        //     System.out.println("You are playing a game");
        //     System.out.print("Press Q to quit: ");
        //     response = scanner.next().toUpperCase();
        // }

        // System.out.println("\nYou have quit the game\n");

        // scanner.close();

        // Scanner scanner = new Scanner(System.in);

        // int age;

        // System.out.print("Enter your age: ");
        // age = scanner.nextInt();

        // do {
        //     System.out.println("Your age cannot be negative");
        //     System.out.print("Enter your age: ");
        //     age = scanner.nextInt();
        // }while(age < 0);

        // while(age < 0) {
        //     System.out.println("Your age cannot be negative");
        //     System.out.print("Enter your age: ");
        //     age = scanner.nextInt();
        // }

        // System.out.println("You are " + age + " years old");

        // scanner.close();

        Scanner scanner = new Scanner(System.in);

        int number = 0;

        // while(number < 1 || number > 10){
        //     System.out.print("Enter a number between 1 - 10: ");
        //     number = scanner.nextInt();
        // }

        do {
            System.out.print("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close();

    }

}