import java.util.regex.Pattern;


public class InputValidator {

    /*
    *  Regular expression to filtered out all the invalid string input
    * */
    private final String input_regex = "£?\\d[0-9]*\\.?[0-9]*p?P?";

    /*
     *  A Method to check whether user input data is valid or not.
     * */
    public boolean isValidInput(String input) {

        boolean isValid = true;

        if (input.isEmpty())
            isValid = false;

        else if(!Pattern.matches(input_regex, input)){
            isValid = false;
        }

        return isValid;
    }
}
