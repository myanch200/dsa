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
}
