import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Pi
        // System.out.println(Math.PI);
        // Exponential
        // System.out.println(Math.E);


        // Power
        // double result = Math.pow(2, 3);
        // System.out.println(result);

        // Absolute value
        // result = Math.abs(-5);
        // System.out.println(result);

        // Square root
        // result = Math.sqrt(9);
        // System.out.println(result);

        // Round to nearest integer
        // result = Math.round(3.14);
        // System.out.println(result);

        // Round to next integer
        // result = Math.ceil(3.14);
        // System.out.println(result);

        // Round to previous integer
        // result = Math.floor(3.99);
        // System.out.println(result);

        // Max of nums
        // result = Math.max(10, 20);
        // System.out.println(result);

        // Min of nums
        // result = Math.min(10, 20);
        // System.out.println(result);

        // Hypotenuse = a²+b²
        // Scanner scanner = new Scanner(System.in);

        // double a;
        // double b;
        // double c;

        // System.out.print("Enter length of side A: ");
        // a = scanner.nextDouble();

        // System.out.print("Enter length of side B: ");
        // b = scanner.nextDouble();

        // c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        // System.out.println("The hypotenuse (side c): " + c);

        // scanner.close();

        // circumference = 2 * PI * radius;
        // area = Math.PI * Math.pow(radius, 2)
        // volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3)

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference is: %.1fcm \n", circumference);
        System.out.printf("The area is: %.1fcm² \n", area);
        System.out.printf("The volume: %.1fcm³ \n", volume);


        scanner.close();

    }

}