public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest(String string) {

        // Sets variable
        String newString = "";

        // Runs over the entire string
        for (int i = 0; i < string.length(); i++) {
            int charI = string.charAt(i);

            // Checks if the character is one of the letters: a, e, i, o, u
            if (charI == 97 || charI == 101 || charI == 105 || charI == 111 || charI == 117) {
                newString += (char) (charI - 32);
            } else
            // Checks if the character is not one of the letters: A,E, I, O, U
            if ((charI > 65 && charI < 69) || (charI > 69 && charI < 73) || (charI > 73 && charI < 79)
                    || (charI > 79 && charI < 85) || (charI > 85 && charI < 91)) {
                newString += (char) (charI + 32);
            } else {
                newString += (char) (charI);
            }
        }
        return newString;
    }

    public static String camelCase(String string) {

        // Sets variable
        String newString = "";
        // Inserts the resulting string so that each word starts with an uppercase
        // letter and the rest of the letters are lowercase
        newString = uppercaseLetter(string);
        // Makes the first word in the string newString so that all letters in it are
        // lowercase
        newString = firstWordLowerCase(newString);
        // Removes all spaces in the newString string
        newString = removedSpaces(newString);
        return newString;
    }

    // The function receives a string and returns the same string only that in the
    // first word it makes all letters lowercase
    public static String firstWordLowerCase(String string) {

        // Sets variables
        String newString = "";
        int i = 0;
        int firstChar = string.charAt(i);

        // Checks for spaces before a letter is reached
        while (firstChar == 32) {
            i++;
            // Checks if the string is over
            if (i == string.length()) {
                return newString;
            }
            firstChar = string.charAt(i);
        }
        // Runs on the first word
        while (firstChar != 32) {
            // Checks if the letter is an uppercase letter
            if (firstChar > 64 && firstChar < 91) {
                newString += (char) (firstChar + 32);
            } else {
                newString += (char) (firstChar);
            }
            i++;
            // Checks if the string is over
            if (i == string.length()) {
                return newString;
            }
            firstChar = string.charAt(i);
        }
        // Runs over the rest of the string
        while (i < string.length()) {
            firstChar = string.charAt(i);
            newString += (char) (firstChar);
            i++;
        }
        return newString;
    }

    // The function receives a string and returns it so that each word starts with
    // an uppercase letter and the rest of the letters are lowercase
    public static String uppercaseLetter(String string) {

        // Sets variables
        String newString = "";
        int i = 0;
        int firstChar = string.charAt(i);

        // Runs over the entire string
        while (i < string.length()) {
            firstChar = string.charAt(i);
            // Checks if the character is a space
            if (firstChar == 32) {
                newString += (char) (firstChar);
            } else
            // Checks if the character is the first character in the string
            if (i == 0) {
                // Checks if the letter is an lowercase letter
                if (firstChar > 96 && firstChar < 123) {
                    newString += (char) (firstChar - 32);
                } else {
                    newString += (char) (firstChar);
                }
            } else
            // Checks if this is a new word in the string
            if (string.charAt(i - 1) == 32) {
                // Checks if the letter is an lowercase letter
                if (firstChar > 96 && firstChar < 123) {
                    newString += (char) (firstChar - 32);
                } else {
                    newString += (char) (firstChar);
                }
            } else {
                // Checks if the letter is an lowercase letter
                if (firstChar > 64 && firstChar < 91) {
                    newString += (char) (firstChar + 32);
                } else {
                    newString += (char) (firstChar);
                }
            }
            i++;
        }
        return newString;
    }

    // The function accepts a string and returns it without spaces
    public static String removedSpaces(String string) {

        // Sets variable
        String newString = "";

        // Runs over the entire string
        for (int i = 0; i < string.length(); i++) {
            // Checks if the character is a space
            if (string.charAt(i) != 32) {
                newString += (char) (string.charAt(i));
            }
        }
        return newString;
    }

    public static int[] allIndexOf(String string, char chr) {

        // Sets variable
        int counter = 0;

        // Runs over the entire string
        for (int i = 0; i < string.length(); i++) {
            // Checks if the current character in the string is equal to the received
            // character
            if (string.charAt(i) == chr) {
                counter++;
            }
        }
        // Building a new array in the size of the number of occurrences of the
        // character
        int[] indexOfTheLetterPlace = new int[counter];
        int j = 0;
        // Runs over the entire string
        for (int i = 0; i < string.length(); i++) {
            // Checks if the current character in the string is equal to the received
            // character
            if (string.charAt(i) == chr) {
                // Inserts the index of the character into the array
                indexOfTheLetterPlace[j] = i;
                j++;
            }
        }
        return indexOfTheLetterPlace;
    }
}