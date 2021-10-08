public class InputFormatter {

    /*
    *  A method to format user valid input data to the corresponding pence value.
    * */
    public Long formatUserValidInput(String validInput) {
        long formattedValue = 0;
        boolean hasPoundSign = validInput.contains("£");
        validInput = validInput.replaceFirst("£", "");
        validInput = validInput.replaceFirst("p", "");


        boolean hasDecimalPoint = validInput.contains(".");
        if (hasDecimalPoint) {


            formattedValue = Math.round(Double.parseDouble(validInput) * 100.0);

        } else {


            if (hasPoundSign) {
                validInput = validInput + "00";
            }

            try {
                formattedValue = Long.parseLong(validInput);
            } catch (NumberFormatException e) {
                formattedValue = 0;
            }
        }

        return formattedValue;
    }

}
