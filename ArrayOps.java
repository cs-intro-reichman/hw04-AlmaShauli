public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int findMissingInt(int[] array) {

        // Sets variables
        boolean isExist = false;
        int missingNumber = 0;
        int currentNumber = 0;

        // Runs on the whole array
        while (currentNumber < array.length) {

            // Runs on the whole array for the currentNumber
            for (int i = 0; i < array.length; i++) {
                // Checks if the number exists in the array
                if (array[i] == missingNumber) {
                    isExist = true;
                    break;
                }
            }
            // Checks if the number does not exist in the array
            if (isExist == false) {
                break;
            } else {
                missingNumber++;
                isExist = false;
            }
            currentNumber++;
        }
        return missingNumber;
    }

    public static int secondMaxValue(int[] array) {

        // Sets the initial value for maxValue and secondMax
        int maxValue = array[0];
        int secondMax = array[0];

        // Runs on the whole array
        for (int i = 1; i < array.length; i++) {
            // Checks if the number is greater than maxValue
            if (maxValue <= array[i]) {
                // Changes the maxValue and secondMax accordingly
                secondMax = maxValue;
                maxValue = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {

        // Sets variables
        boolean sameNumber = false;

        // Runs on the 2 arrays
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                // Checks if the number in array1[i] exists in array2
                if (array1[i] == array2[j]) {
                    sameNumber = true;
                }
            }
            // Checks if the number in array1[i] is not exists in array2
            if (sameNumber == false) {
                return false;
            } else {
                sameNumber = false;
            }
        }
        return true;
    }

    public static boolean isSorted(int[] array) {

        // Sets variables
        boolean increase = false;
        boolean decrease = false;
        boolean isSort = true;

        // Checks if the array is increasing or decreasing
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                if (array[i] < array[i + 1]) {
                    increase = true;
                    break;
                } else {
                    decrease = true;
                    break;
                }
            }
        }

        // Checks if the array is sorted
        for (int i = 0; i < array.length - 1; i++) {
            if (increase) {
                if (array[i] > array[i + 1]) {
                    isSort = false;
                    break;
                }
            }
            if (decrease) {
                if (array[i] < array[i + 1]) {
                    isSort = false;
                    break;
                }
            }
        }

        // Checks if there is only one number in the array
        if (!increase && !decrease) {
            return true;
        }
        return isSort;
    }

}
