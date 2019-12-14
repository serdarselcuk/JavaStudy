package Utilities;



public class StringFactory {


    public static String getString(int lengthOfString) {

        String random = "";          // random string will be created char by char and will be stored here
        for (int i = 0; i < lengthOfString; i++) {
            int index = 0;
            if (i == 0) {                                       // if it is the first turn I prefer to take a alphabetic char "A" to "z"
                index = (int) (57 * Math.random()) + 65;      // char "A" is on 65 and "z" is 122 (65 + 57). So the number will be between 65 - 122
                if (index < 97 && index < 90) {              // to avoid from twhe chars between "Z" and "a"
                    index += 7;
                }
            } else {
                index = (int) (92 * Math.random()) + 33;// the chars that I can use in a string
            }
            random += "" + (char) index;  //  I convert the numbers to the char and added to the string
        }
        return random;
    }
}