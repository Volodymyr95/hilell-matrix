package org.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        int[][] matrix2 = new int[4][4];
        int[][] matrix3 = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(10);
                matrix2[i][j] = random.nextInt(10);

                matrix3[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(Arrays.deepToString(matrix3));

    }
}
