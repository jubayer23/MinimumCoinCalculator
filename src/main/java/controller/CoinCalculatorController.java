package controller;


import Model.Amount;
import view.CoinCalculatorView;
import view.EventListener.UserStringInputCallBack;
import view.Utils.InputFormatter;
import view.Utils.InputValidator;

public class CoinCalculatorController {

    private final CoinCalculatorView view;
    private final InputValidator inputValidator;
    private final InputFormatter inputFormatter;
    private final Amount model;

    public CoinCalculatorController(CoinCalculatorView view) {
        this.view = view;
        inputValidator = new InputValidator();
        inputFormatter = new InputFormatter();
        model = new Amount();
    }

    public void takeUserInput(UserStringInputCallBack callBack) {


        String validInput = view.showUserInput(inputValidator);
        callBack.gotStringInput(validInput);

    }


    /*
     *  A method to get solution of minimum coins combination from the model class and
     * send the result to the view.
     * */
    public void CalculateDenominationsOfAmount(String input) {
        long formattedValue = inputFormatter.formatUserValidInput(input);

        model.setRawAmount(input);
        model.setFormattedAmount(formattedValue);


        view.print("Denominations: " + model.CalculateMinCoinDenominations());

    }


}
