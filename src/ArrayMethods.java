public class ArrayMethods {
    /*
     * Takes an integer array and returns a new array with "toAdd" added to the end of the array
     * All other elements remain the same
     * Returned array is one longer than original array
     */
    public static int[] arrayAdd(int[] arrayIn, int toAdd) {
        int[] arrayOut = new int[arrayIn.length + 1];
        System.arraycopy(arrayIn, 0, arrayOut, 0, arrayIn.length);
        arrayOut[arrayIn.length] = toAdd;
        return arrayOut;
    }

    /*
     * Takes an integer array and returns a new array without the last element of the original array
     * All other elements remain the same
     * Returned array is one shorter than original array
     */
    public static int[] arrayPop(int[] arrayIn) {
        int[] arrayOut = new int[arrayIn.length - 1];
        System.arraycopy(arrayIn, 0, arrayOut, 0, arrayIn.length - 1);
        return arrayOut;
    }

    /*
     * Takes an integer array and returns a new integer array that have "toInsert" at the position "insertPos"
     * Returned array is one longer than original array
     * Values after the inserted integer will be pushed back by one position
     * insertPos must be between 0 and the length of the input array
     */
    public static int[] arrayInsert(int[] arrayIn, int toInsert, int insertPos) {
        int[] arrayOut = new int[arrayIn.length + 1];
        System.arraycopy(arrayIn, 0, arrayOut, 0, insertPos);
        arrayOut[insertPos] = toInsert;
        System.arraycopy(arrayIn, insertPos, arrayOut, insertPos + 1, arrayOut.length - insertPos - 1);
        return arrayOut;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        array[2] = 2;
        array[3] = 2;
        array[4] = 2;
        array[9] = 2;
        array = arrayAdd(array, 1);
        array = arrayPop(array);
        array = arrayInsert(array, 1, 3);
    }
}
