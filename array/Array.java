package array;

import java.util.Scanner;

public class Array {




    public static void main(String[] args) {

        // array syntax 
        // data_type[]  variable_name = new data_type[size]  @@object creating happen at runtime in the heap memory
        Scanner in = new Scanner(System.in);
        System.out.println(in);

        int[][] matrix = new int[3][2];
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0 ; col < matrix[row].length ; col++) {
                matrix[row][col] = in.nextInt();

            }
        }

    }

}
