public class Arrays {
    public static void main(String[] args) {
        int[] array1 = new int[20];
        for (int i = 0; i < 20; i++) {
            array1[i] = (int) (Math.random() * 6 + 1);
        }
        int ones = 0;
        for (int i = 0; i < 20; i++) {
            if (array1[i] == 1) {
                ones++;
            }
        }

        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = (int) (Math.random() * 100 + 1);
        }
        int sum2 = 0;
        for (int i = 0; i < 10; i++) {
            sum2 += array2[i];
        }

        int temp = array2[5];
        array2[5] = array2[3];
        array2[3] = temp;

        for (int i = 0; i < 5; i++) {
            temp = array2[10 - i - 1];
            array2[10 - i - 1] = array2[i];
            array2[i] = temp;
        }
    }
}
