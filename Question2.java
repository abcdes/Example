/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.awt.Color;
import java.util.Formatter;
import java.util.Scanner;

public class Question2 {

    public String hexconvert(int red, int green, int blue) {
        Formatter f = new Formatter(new StringBuffer("#"));
        f.format("%02X", red);
        f.format("%02X", green);
        f.format("%02X", blue);
        f.toString(); //#0000FF

        return f.toString();

    }

    public static void main(String[] args) {
        int val = 0;
        int val1 = 0;
        int val2 = 0;
        Scanner in = new Scanner(System.in);
        Color color = null;
        System.out.println("Enter Red Value:");
        val = in.nextInt();
        System.out.println("Enter Green Value:");
        val1 = in.nextInt();
        System.out.println("Enter Blue Value:");
        val2 = in.nextInt();
        Question2 obj = new Question2();
        String colorVal = obj.hexconvert(val, val1, val2);
        System.out.println("Color COde is: " + colorVal);
    }
}
