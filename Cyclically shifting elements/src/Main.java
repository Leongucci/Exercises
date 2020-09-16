import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int length = scn.nextInt();
        int[] array = new int[length];
        int[] array2 = new int[length + 1];

        for (int i = 0; i < length; i++) {
            array[i] = scn.nextInt();
            array2[i + 1] = array[i];
        }

        for (int i = 0; i < length; i++) {
            if (i == 0) {
                array[i] = array[length - 1];
            } else {
                array[i] = array2[i];
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
