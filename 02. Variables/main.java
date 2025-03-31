public class Main {

    public static void main(String[] args){
        
        // Variable - reusable container for a value
        // A variable behaves as if it was the value it contains

        // Primitive - simple value stored directly in memory
        // Reference - memory address (stack) that points to the (heap)

        // Primitive vs Reference
        // 
        // int          string
        // double       array
        // char         object
        // boolean

        // 2 steps to creating a variable
        // 1. declaration
        // 2. assignment

        // int

        int age; // declaration
        // System.out.println(age); // Not initialized so gives error

        age = 21;
        System.out.println(age);

        // int age = 30.5; // If we declare as int only store int to it

        int year = 2025;
        int quantity = 1;

        System.out.println(year);
        System.out.println(quantity);

        System.out.println("The year is " + year);

        // double

        double price = 1999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$"+price);

        // char

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);

        // bool

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);

        String name = "Ghost Reborn";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Lamborghini";
        String color = "red";

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa);
        System.out.println("Your average letter grade is " + grade);

        System.out.println("YOu choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if (forSale) {
            System.out.println("There is a " + car  + " for sale");
        }else{
            System.out.println("The " + car + " is not for sale");
        }

    }

}