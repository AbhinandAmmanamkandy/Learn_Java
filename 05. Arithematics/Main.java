public class Main {

    public static void main(String[] args) {

        // Arithematic Operators
        int x = 10;
        int y = 2;
        int z;

        // Addition
        z = x + y;
        System.out.println(z);

        // Subtraction
        z = x - y;
        System.out.println(z);

        // Multiplication
        z = x * y;
        System.out.println(z);

        // Division
        z = x / y;              // This is integer division
        System.out.println(z);
        
        // Modulus
        z = x % y;
        System.out.println(z);





        // Augmented Assignment Operators
        x = 10;
        y = 3;

        // Augmented Addition x = x + y
        x += y;
        System.out.println(x);

        // Augmented Subtraction x = x - y
        x -= y;
        System.out.println(x);

        // Augmented multiplication x = x * y
        x *= y;
        System.out.println(x);

        // Augmented division x = x / y
        x /= y;
        System.out.println(x);

        // Augmented Modulus x = x % y
        x %= y;
        System.out.println(x);







        // Increment and Decrement Operators
        x = 1;

        // Increment by 1 ie x = x + 1
        x++;

        // Decrement by 1 ie x = x - 1
        x--;





        // ORDER OF OPERATIONS [P-E-M-D-A-S]
        // Peranthesis Exponents Multiplication Division Addition Subtraction
        double result = 3 + 4 * (7 - 5) / 2.0;

        // 3 + 4 * 2 / 2.0
        // 3 + 8 / 2.0
        // 3 + 4
        // 7

        System.out.println(result);

    }

}