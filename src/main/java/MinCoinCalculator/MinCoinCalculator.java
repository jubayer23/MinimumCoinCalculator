package MinCoinCalculator;

import controller.CoinCalculatorController;
import view.CoinCalculatorView;

public class MinCoinCalculator {

    public static void main(String[] args) {


        CoinCalculatorView view = new CoinCalculatorView();

        CoinCalculatorController controller = new CoinCalculatorController(view);

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
