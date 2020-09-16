import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int length = scn.nextInt();
        int[] array = new int[length];
        int highest = 0;

        for (int i = 0; i < length; i++) {
            array [i]= scn.nextInt();
        }

        for (int i = 1; i < length; i++) {
            int product = array[i] * array[i - 1];
            if (product > highest) {
                highest = product;
            }
        }


        System.out.println(highest);
    }
}