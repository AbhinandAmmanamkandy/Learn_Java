import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // We cannot add to array
        // String[] foods = {};
        // System.out.println(foods.length);

        // String[] foods = new String[3];
        // foods[0] = "pizza";
        // foods[1] = "taco";
        // foods[2] = "hamburger";

        // for(String food : foods){
        //     System.out.println(food);
        // }

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("How many foods do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i=0; i<foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food: foods){
            System.out.println(food);
        }

        scanner.close();

    }

}