import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class InputValidatorTest {

    private InputValidator inputValidator;

    @BeforeEach
    void setUp() {
        inputValidator = new InputValidator();
    }

    @Test
    public void returnFalseWhenInputStringBlank() {

        /*
         *  Test the method with blank input
         * */
        assertFalse(inputValidator.isValidInput(""));

        /*
         *  Test the method with alphabet only input
         * */
        assertFalse(inputValidator.isValidInput("abc"));

        /*
         *  Test the method with pound signature - £ without any digit in the input
         * */
        assertFalse(inputValidator.isValidInput("£"));

        /*
         *  Test the method with pence signature - p without any digit in the input
         * */
        assertFalse(inputValidator.isValidInput("p"));

        /*
         *  Test the method with invalid alphabet and digit input
         * */
        assertFalse(inputValidator.isValidInput("1x"));

        /*
         *  Test the method with more than one pence - p sign at the end of the input
         * */
        assertFalse(inputValidator.isValidInput("0000123234.44pp"));

        /*
         *  Test the method with pound signature - £ and pence signature - p when
         *  p comes before £ sign.
         * */
        assertFalse(inputValidator.isValidInput("p1£"));

        /*
         *  Test the method with special character input
         * */
        assertFalse(inputValidator.isValidInput("£*?134.34"));

        /*
         *  Test the method with invalid decimal value
         * */
        assertFalse(inputValidator.isValidInput("1..23"));

        /*
         *  Test the method with Non-numeric, non-symbol character along with valid symbols
         * */
        assertFalse(inputValidator.isValidInput("£1x.0p"));

        /*
         *  Test the method with Missing digits
         * */
        assertFalse(inputValidator.isValidInput("£p"));

        /*
         *  Test the method with pence - p at the middle of input
         * */
        assertFalse(inputValidator.isValidInput("00001p23234.44"));

        /*
         *  Test the method with negative value
         * */
        assertFalse(inputValidator.isValidInput("-12"));
    }

    @Test
    public void returnTrueWhenInputStringValid() {
        /*
         *  Test the method with int input
         * */
        assertTrue(inputValidator.isValidInput("123"));

        /*
         *  Test the method with decimal input
         * */
        assertTrue(inputValidator.isValidInput("123234.44"));
    }

}