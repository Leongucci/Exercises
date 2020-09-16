/*
The cinema has n rows, each row consists of m seats (n and m do not exceed 20).
The two-dimensional matrix stores the information on the sold tickets,
number 1 means that the ticket for this place is already sold, the number 0 means
that the place is available.
You want to buy k tickets to the neighboring seats in the same row.
Find whether it can be done.

Input data format

On the input, the program gets the number of n rows and m seats.
Then, there are n lines, each containing m numbers
(0 or 1) separated by spaces. The last line contains a number k.

Output data format

The program should output the number of the row with k consecutive available seats.
If there are several rows with k available seats, output the first row with these seats.
If there is no such a row, output the number 0.

Sample Input:
3 4
0 1 0 1
1 1 0 1
1 0 0 1
2

Sample Output:
3


Sample Input:
3 3
0 1 0
1 0 0
1 1 1
3

Sample Output:
0

 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        //setup
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] twoDimArray = new int[n][m];
        List<Integer> freeRows = new ArrayList<>();
        int counter = 0;

        //fill array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twoDimArray[i][j] = scn.nextInt();
            }
        }

        //get seats
        int seats = scn.nextInt();

        //loop for checking available seats
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                //if we only need 1 available seat, return the row where we find first zero
                if (seats == 1 && twoDimArray[i][j] == 0) {
                    freeRows.add(i + 1);
                }
                //for this seat [i][j], compare it to k seats in front
                for (int k = 1; k < seats; k++) {
                    //if there aren't enough available remaining seats in this row, break
                    if (j + seats > m){
                        break;
                    }
                    //counter for seats that equal zero
                    if (twoDimArray[i][j] == 0 && twoDimArray[i][j + k] == 0) {
                        counter++;
                    }
                    if (counter >= seats - 1) {
                        freeRows.add(i + 1);
                    }
                }
                //reset counter after each seat
                counter = 0;
            }

        }

        //check if we found any results
        if (freeRows.isEmpty()) {
            System.out.println(0);
        } else {
            //return first inserted result
            System.out.println(freeRows.get(0));
        }

    }
}