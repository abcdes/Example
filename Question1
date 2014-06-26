/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jayesh.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrator
 */
public class Question1 {

    public static void main(String[] args) throws IOException {
        int minX = 0, minY = 0, maxX = 0, maxY = 0;
        boolean flag = true;
        int[][] intArray = null;
        int i = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter No. Coordinates :");
        try {
            i = Integer.parseInt(br.readLine());
            intArray = new int[i][2];
        } catch (NumberFormatException nfe) {
            System.err.println("Invalid Format!");
        }
        System.out.println("Array :" + intArray.length);
        for (int j = 0; j < i; j++) {
            System.out.println("Enter X Coordinate Value :");
            intArray[j][0] = Integer.parseInt(br.readLine());

            System.out.println("Enter Y Coordinate Value :");
            intArray[j][1] = Integer.parseInt(br.readLine());
        }

        for (int j = 0; j < i; j++) {
            System.out.print("(" + intArray[j][0] + ", " + intArray[j][1] + "), ");
            if (flag) {
                flag = false;
                minX = intArray[j][0];
                minY = intArray[j][1];
                maxX = intArray[j][0];
                maxY = intArray[j][1];
            }
            if (minX > intArray[j][0]) {
                minX = intArray[j][0];
            }
            if (minY > intArray[j][1]) {
                minY = intArray[j][1];
            }
            if (maxX < intArray[j][0]) {
                maxX = intArray[j][0];
            }
            if (maxY < intArray[j][1]) {
                maxY = intArray[j][1];
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("(x, y) : (" + minX + ", " + minY + ")");
        System.out.println("(x, y) : (" + maxX + ", " + maxY + ")");
    }
}
