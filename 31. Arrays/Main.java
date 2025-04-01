import java.util.Arrays;
import javax.sound.sampled.AudioSystem;

public class Main {

    public static void main(String[] args){

        // array = a collection of values of the same data type
        //      * think of it as a variable that can store more than 1 value *

        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};

        // Changing values
        fruits[0] = "Pineapple";

        // Array length
        int numOfFruits = fruits.length;

        // Printing values
        for(int i=0; i< fruits.length; i++){
            System.out.println(fruits[i]);
        }

        System.out.println();

        // Sorting array
        Arrays.sort(fruits);

        // Fill everything with value
        Arrays.fill(fruits, "pineapple");

        // Enhanced for loop or a for each loop
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

    }

}