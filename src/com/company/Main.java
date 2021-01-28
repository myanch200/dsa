package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[][] square = new int[3][3];
        int theRow = 0;
        int theCol = 0;
        int theDigit = 0;
        boolean stop = false;
        //Main loop

        do{
            printSquare(square);
            System.out.println("Enter the row to place number");
            theRow = scanner.nextInt();
            System.out.println("Enter the col to place number");
            theCol = scanner.nextInt();
            System.out.println("Enter the number to place");
            theDigit = scanner.nextInt();
            square[theRow][theCol] = theDigit;
            stop = checkTheSquare(square);
        }while (!stop);
    }

    private static void printSquare(int[][] square) {
        for (int row = 0; row <3 ; row++) {
            for (int col = 0; col <3 ; col++) {
                System.out.print(square[row][col]+ " ");

            }
            System.out.println();

        }
    }

    private  static boolean checkRow(int[][]matrix){
        int row1 = matrix[0][0] +matrix[0][1] +matrix[0][2] ;
        int row2 = matrix[1][0]+ matrix[1][1]+matrix[1][2];
        int row3 = matrix[2][0]+ matrix[2][1]+matrix[2][2];
        return row1 == 15 && row2 == 15 && row3 == 15;
    }

    private  static boolean checkCol(int[][]matrix){
        int col1 = matrix[0][0] +matrix[1][0] +matrix[2][0] ;
        int col2 = matrix[0][1]+ matrix[1][1]+matrix[2][1];
        int col3 = matrix[0][2]+ matrix[1][2]+matrix[2][2];
        return col1 == 15 && col2 == 15 && col3 == 15;
    }


    private  static  boolean checkDiagonals(int[][] matrix){
        int diagonal1 = matrix[0][0]+matrix[1][1]+matrix[2][2];
        int diagonal2 = matrix[2][0]+matrix[2][1]+matrix[2][2];
        return diagonal1 == 15 && diagonal2 == 15;


    }
    private  static boolean checkTheSquare(int[][]matrix){
        if(checkRow(matrix)&&checkCol(matrix)&&checkDiagonals(matrix)){
            System.out.println("Congratulations you now have magic square");
            return true;
        }else{
            System.out.println("You are getting there but still not quate a magic square");
            return false;
        }
    }
}
