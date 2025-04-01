public class Main {

    public static void main(String[] args){

        // method = a block of reusable code that is executed when called ()

        // String name = "Ghost Reborn";
        // int age = 25;

        // happyBirthDay(name, age);

        double result = square(3);
        System.out.println(result);

        double res = cube(3);
        System.out.println(res);

        String fullName = getFullName("Ghost", "Reborn");
        System.out.println(fullName);

        int age = 22;
        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }else {
            System.out.println("You must be 18+ to sign up");
        }

    }

    static boolean ageCheck(int age) {
        return age >= 18;
    }

    static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    static double cube(double number){
        return number * number * number;
    }

    static double square(double number){
        return number * number;
    }

    static void happyBirthDay(String name, int age) {
        System.out.println("\nHappy Birthday to you!");
        System.out.printf("Happy Brithday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }

}