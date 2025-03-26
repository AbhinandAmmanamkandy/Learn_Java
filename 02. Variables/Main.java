public class Main {
    public static void main(String[] args){
        // variable - a reusable container for a value
        //      a variable behaves as if it  was the value it contains

        // Primitive - simple value stored directly in memory (stack)
        // Reference - memory address (stack) that points to the heap

        // Privitive vs Reference
        // int          string
        // double       array
        // char         object
        // boolean

        // 2 steps to creating a variable
        // ------------------------------
        // 1. declaration
        // 2. assignment

        // int age; // declaration
        int age = 23; // declaration and assignment
        int year = 2025;
        int quantity = 1;
        System.out.println("The year is " + year);

        // double
        double price = 1999;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price);

        // char
        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(grade);

        // boolean
        boolean isStudent = false;
        boolean isForSale = true;
        boolean isOnline = true;
        System.out.println(isStudent);

        if(isStudent){
            System.out.println("He is a stuent");
        }else{
            System.out.println("He is not a student");
        }

        // String
        String name = "Ghost Reborn";
        System.out.println("Hello "+name);
        String food = "pizza";
        System.out.println("Your favorite food is " + food);
        String email = "fake123@gmail.com";
        System.out.println("Your email is " + email);
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);

        System.out.println("Your choice is a " + color+" " + year+" " + car);
        System.out.println("The price is: "+ currency + price);

        if(isForSale){
            System.out.println("There is a " + car + " for sale");
        }else{
            System.out.println("The " + car + " is not for sale");
        }

    }
}