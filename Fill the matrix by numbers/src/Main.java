import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] twoDimArray = new int[n][n];

        //create array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if (i == j) {
                        twoDimArray[i][j] = 0;
                    } else if (j == i + k) {
                        twoDimArray[i][j] = k;
                    } else if (j == i - k) {
                        twoDimArray[i][j] = k;
                    }

                }
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }


        /*
           FOR N = 5

           00 11 22 33 44 ZEROS I = J
           01 12 23 34 -- ONES  J = I + 1
           10 21 32 43 -- ONES  J = I - 1
           20 31 43 -- -- TWOS  J = I - 2
           02 13 24 -- -- TWOS  J = I + 2
           30 41 -- -- -- THREE J = I - 3
           03 14 -- -- -- THREE J = I + 3
           40 -- -- -- -- FOUR  J = I - 4
           04 -- -- -- -- FOUR  J = I + 4

         */

        }
    }