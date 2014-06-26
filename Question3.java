
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Question3 {

    public void calculatePercentile(int intArray[]) {

        if (intArray.length > 0) {
            int listSize = intArray.length;
            double counter1 = 0;
            double counter2 = 0;
            double counter3 = 0;
            double counter4 = 0;
            double counter5 = 0;
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] <= 3) {
                    counter1++;
                }
                if (intArray[i] <= 8) {
                    counter2++;
                }
                if (intArray[i] <= 16) {
                    counter3++;
                }
                if (intArray[i] <= 20) {
                    counter4++;
                }
                if (intArray[i] <= 22) {
                    counter5++;
                }
            }
            System.out.println("Output is :: ");
            System.out.println(((int) Math.floor((counter1 / listSize) * 100)) + "% of the numbers are less than or equal to 3");
            System.out.println(((int) Math.floor((counter2 / listSize) * 100)) + "% of the numbers are less than or equal to 8");
            System.out.println(((int) Math.floor((counter3 / listSize) * 100)) + "% of the numbers are less than or equal to 16");
            System.out.println(((int) Math.floor((counter4 / listSize) * 100)) + "% of the numbers are less than or equal to 20");
            System.out.println(((int) Math.floor((counter5 / listSize) * 100)) + "% of the numbers are less than or equal to 22");
        } else {
            System.out.println("Input Array Size is Zero.");
        }

    }

    public static void main(String[] args) {
        Question3 question3 = new Question3();
        int intArray[] = null;
        int i = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of an Array :");
        try {
            i = Integer.parseInt(br.readLine());
            intArray = new int[i];
        } catch (NumberFormatException nfe) {
            System.err.println("Invalid Format!");
        } catch (IOException ex) {
            Logger.getLogger(Question3.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int j = 0; j < i; j++) {
            System.out.println("Enter  Value :");
            try {
                intArray[j] = Integer.parseInt(br.readLine());
            } catch (IOException ex) {
                Logger.getLogger(Question3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        question3.calculatePercentile(intArray);
    }
}
