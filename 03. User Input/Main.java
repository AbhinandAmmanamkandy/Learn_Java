import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // Scanner scanner = new Scanner(System.in);

        // // Read a string ignoring everything after space
        // System.out.print("Enter your name: ");
        // String name = scanner.next();
        // scanner.nextLine();                      // scanner.next() leaves \n in buffer so to remove it another line is read
        // System.out.println("Hello " + name);

        // // Read A line
        // System.out.print("Enter your name: ");
        // name = scanner.nextLine();
        // System.out.println("Hello " + name);

        // // Read an integer
        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();
        // System.out.println("You are " + age + " years old");

        // // Read a double
        // System.out.print("Enter gpa: ");
        // double gpa = scanner.nextDouble();
        // System.out.println("Your gpa is " + gpa);

        // // Read a boolean
        // System.out.print("Are you a student? (true/false): ");
        // boolean isStudent = scanner.nextBoolean();
        // System.out.println("isStudent: " + isStudent);

        // scanner.close();

        // Calculate the area of rectangle
        double width = 0;
        double height = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.print("Area: " + area + "cm²");

        scanner.close();

    }

}