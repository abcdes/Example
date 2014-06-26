/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.awt.Color;
import java.util.Formatter;
import java.util.Scanner;

public class Question2 {

    public String hexconvert(Color color) {
        Formatter f = new Formatter(new StringBuffer("#"));
        f.format("%02X", color.getRed());
        f.format("%02X", color.getGreen());
        f.format("%02X", color.getBlue());
        f.toString(); //#0000FF

        return f.toString();

    }

    public static void main(String[] args) {
        int val = 0;
        Scanner in = new Scanner(System.in);
        Color color = null;
        System.out.println("Select Color Number");
        System.out.println("1:Red");
        System.out.println("2:Green");
        System.out.println("3:Blue");
        System.out.println("Enter Color Number:");
        val = in.nextInt();
        switch (val) {
            case 1:
                color = Color.RED;
                break;
            case 2:
                color = Color.GREEN;
                break;
            case 3:
                color = Color.BLUE;
                break;
            default:
                System.out.println("Please Enter Correct Number");
                break;
        }
        Question2 obj = new Question2();
        String colorVal = obj.hexconvert(color);
        System.out.println("Color COde is: " + colorVal);
    }
}
