public class InputFormatter {

    public Long formatUserValidInput(String validInput) {
        long formattedValue = 0;

        try {
            formattedValue = Long.parseLong(validInput);
        } catch (NumberFormatException e) {
            formattedValue = 0;
        }

        return formattedValue;
    }
}
