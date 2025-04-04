import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // && = AND
        // || = OR
        // ! = NOT
        double temp = -10;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("The weather is GOOD 😄");
            System.out.println("It is SUNNY outside ☀️");
        } else if(temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("The weather is GOOD 😄");
            System.out.println("It is CLOUDY outside ☁️");
        } else if(temp < 0 || temp > 30){
            System.out.println("The weather is bad 🙅‍♂️");
        }

        Scanner scanner = new Scanner(System.in);

        // usename must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;
        System.out.print("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be 4-12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores");
        } else{
            System.out.println("Welcome " + username);
        }

        scanner.close();

    }

}