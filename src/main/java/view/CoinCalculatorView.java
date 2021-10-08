package view;


import view.Utils.InputFormatter;
import view.Utils.InputValidator;

import java.util.Scanner;


public class CoinCalculatorView extends BaseView {

    public static final String TERMINATE_PROGRAM = "exit";

    /*
     *  A method to read user input (Amount) and verify whether this inputted data is valid or invalid.
     * */
    public String showUserInput(InputValidator inputValidator, InputFormatter inputFormatter) {


        print("Give any amount to calculate the minimum number of Sterling coins equivalent to that amount.\nType \"Exit\" to terminate the program. ");
        print("Give Input:");

        Scanner in = new Scanner(System.in);
        String num = "";
        boolean continueLoopForUserInput;
        do {

            num = in.nextLine();

            if ((!inputValidator.isValidInput(num) && !num.equalsIgnoreCase(TERMINATE_PROGRAM))
                    || inputFormatter.formatUserValidInput(num) == 0) {
                print("Invalid input! Please provide valid input!");
                continueLoopForUserInput = true;
            } else continueLoopForUserInput = false;

        } while (continueLoopForUserInput);

        return num;
    }
}
