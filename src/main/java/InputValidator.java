import java.util.regex.Pattern;

public class InputValidator {

    public boolean isValidInput(String input) {

        boolean isValid = true;

        if (input.isEmpty())
            isValid = false;

        return isValid;
    }
}
