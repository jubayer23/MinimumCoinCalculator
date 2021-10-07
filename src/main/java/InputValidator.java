import java.util.regex.Pattern;

public class InputValidator {

    private final String input_regex = "£?[0-9]*\\.?[0-9]*p?P?";

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
