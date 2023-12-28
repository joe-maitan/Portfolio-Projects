import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.util.*;
import java.io.*;

public class StockMarket {

    public static double get_double_input(boolean lower_limit_flag, int lower_limit, boolean upper_limit_flag, int upper_limit, String prompt, String error_msg) {
        String user_input = "";
        double input = 0;
        boolean valid_input = false;

        while (valid_input != true) {
            user_input = JOptionPane.showInputDialog(prompt);

            try {
                input = Double.parseDouble(user_input);
            } catch (NumberFormatException e) {
                valid_input = false;
            } // End try-catch block

            if (lower_limit_flag && input < lower_limit || upper_limit_flag && input > upper_limit) {
                valid_input = false;
                JOptionPane.showMessageDialog(null, error_msg);
            } else {
                valid_input = true;
            } // End if-else statement
        } // End while loop

        

        return input;
    } // End get_double_input() method

    // public static void changeArray(int[] numbers) {
    //     numbers[0] = 10;
    // }

    public static void main(String[] args) {

        // int[] numbers = {1, 2, 3, 4, 5};
        // int[] numbersReference = numbers;

        // changeArray(numbersReference);
    
        // System.out.println(numbers[0]); // prints 10

        // Read in a file of any kind and add the stocks in that file to the
        // stock market array, if formatted incorrectly or one number is missing
        // add 0 or null?

        // Ask what the user would like to do. Validate the input and see what is possible

        double num = get_double_input(true, 0, false, 72, "Enter a number greater than 0", "Number entered was not greater than 0. Try again");


    } // End main method
    
} // End StockMarket class
