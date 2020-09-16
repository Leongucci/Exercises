import java.util.Scanner;

class Main {
    /*
Given a two-dimensional array (matrix) and the two numbers: i and j.
Swap the columns with indexes i and j within the matrix.
Input contains matrix dimensions n and m, not exceeding 100,
then the elements of the matrix, then the indexes i and j.

Sample Input:
3 4
11 12 13 14
21 22 23 24
31 32 33 34
0 1

Sample Output:
12 11 13 14
22 21 23 24
32 31 33 34
     */
    public static void main(String[] args) {
        //setup
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] twoDimArray = new int[n][m];

        //fill array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoDimArray[i][j] = scn.nextInt();
            }
        }

        //receive two columns to swap
        int col1 = scn.nextInt();
        int col2 = scn.nextInt();

        //swap them using temporary values
        for (int i = 0; i < n; i++) {
            int temp = twoDimArray[i][col1];
            twoDimArray[i][col1] = twoDimArray[i][col2];
            twoDimArray[i][col2] = temp;
        }

        //print the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}