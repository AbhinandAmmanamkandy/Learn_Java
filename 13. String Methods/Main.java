public class Main {

    public static void main(String[] args){

        String name = " Ghost Reborn ";

        // length
        int length = name.length();

        // Character at index
        char letter = name.charAt(0);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("o");

        // Upper case
        name = name.toUpperCase();
        System.out.println(name);

        // Lower case
        name = name.toLowerCase();
        System.out.println(name);

        // Remove white space
        name = name.trim();
        System.out.println(name);

        // Replacing letters
        name = name.replace("o", "a");
        System.out.println(name);

        // Check string empty - returns boolean
        if(name.isEmpty()){
            System.out.println("Your name is empty");
        }else{
            System.out.println("Hello " + name);
        }
        
        name = "Ghost Reborn";
        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);


        // contains value
        if(name.contains(" ")){
            System.out.println("Your name contains a space");
        }else {
            System.out.println("Your name doesn't contain any spaces");
        }


        // String equality
        // equalsIgnoreCase ignores upper or lower cases
        if(name.equals("Ghost Reborn")){
            System.out.println("Hello Ghost Reborn");
        } else {
            System.out.println("You are not him");
        }

    }

}