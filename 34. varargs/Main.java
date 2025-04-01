public class Main {

    public static void main(String[] args){

        // varargs - allow a method to accept a varying # of arguments
        //      makes methods more flexible, no need for overloaded method
        //      java will pack the arguments into an array
        //      ... (ellipsis)

        // They can also take in no arguments

        System.out.println(add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(average(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }

    // By this the method can any number of arguments
    static int add(int... numbers){
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers){
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number: numbers){
            sum += number;
        }
        return sum / numbers.length;
    }

    // We cannot write many arguments like this -we counld write a method that accepts any number of arguments
    // static double add(int a, int b){
    //     return a + b;    
    // }
    // static double add(int a, int b, int c){
    //     return a + b + c;    
    // }
    // static double add(int a, int b, int c, int d){
    //     return a + b + c + d;    
    // }
    // static double add(int a, int b, int c, int d, int e){
    //     return a + b + c + d + e;    
    // }
    // static double add(int a, int b, int c, int d, int e, int f){
    //     return a + b + c + d + e + f;    
    // }
    // static double add(int a, int b, int c, int d, int e, int f, int g){
    //     return a + b + c + d + e + f + g;    
    // }

}