package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scaneer = new Scanner(System.in);
        //initializing matrix with dimension 3x3
        int[][] matrix = new int[3][3];
        boolean isEaqual = true;

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scaneer.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        int sumOfFirstDiagonal = matrix[0][0]+matrix[1][1]+matrix[2][2];
        int sumOfSecondDiagonal = matrix[2][0]+matrix[1][1]+matrix[0][2];


        if(sumOfFirstDiagonal!= 15){
            isEaqual = false;
        }

        if(sumOfSecondDiagonal!= 15){
            isEaqual =false;
        }


        System.out.println(isEaqual);
    }
}
