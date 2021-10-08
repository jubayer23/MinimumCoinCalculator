package MinCoinCalculator;

import controller.CoinCalculatorController;
import view.CoinCalculatorView;

public class MinCoinCalculator {

    public static void main(String[] args) {


        CoinCalculatorView view = new CoinCalculatorView();

        CoinCalculatorController controller = new CoinCalculatorController(view);

        /*
        * A infinite loop until user type "exit" in the terminal. The loop continuously scanning
        * user input and process the input to generate minimum coins combination of a amount.
        * */
        final boolean[] loopContinue = {true};
        do {
            controller.takeUserInput(inputString -> {
                if (inputString.equalsIgnoreCase(CoinCalculatorView.TERMINATE_PROGRAM)) loopContinue[0] = false;
                else {
                    controller.CalculateDenominationsOfAmount(inputString);
                }
            });
        } while (loopContinue[0]);
    }
}
