import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import view.Utils.InputFormatter;
import view.Utils.InputValidator;

import static org.junit.jupiter.api.Assertions.*;

class InputFormatterTest {

    private InputFormatter inputFormatter;
    private InputValidator inputValidator;

    @BeforeEach
    void setUp() {
        inputFormatter = new InputFormatter();
        inputValidator = new InputValidator();
    }

    @Test
    void returnValidFormattedResultForValidInput() {

        /*
         *   Test method with Single digit
         * */
        String mockInput = "6";
        long expectedResult = 6;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with big valid string which will exceed the limit of long data type
         * */
        mockInput = "231787389229938939873983787";
        expectedResult = 0;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Double digit
         * */
        mockInput = "75";
        expectedResult = 75;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Pence symbol
         * */
        mockInput = "167p";
        expectedResult = 167;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Pence symbol single digit
         * */
        mockInput = "4p";
        expectedResult = 4;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Pounds decimal
         * */
        mockInput = "1.97";
        expectedResult = 197;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Pound symbol decimal
         * */
        mockInput = "£1.33";
        expectedResult = 133;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Single digit pound symbol
         * */
        mockInput = "£2";
        expectedResult = 200;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Double digit pound symbol
         * */
        mockInput = "£20";
        expectedResult = 2000;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Pound & pence symbol decimal
         * */
        mockInput = "£1.97p";
        expectedResult = 197;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }


        /*
         *   Test method with Missing pence
         * */
        mockInput = "£1p";
        expectedResult = 100;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }


        /*
         *   Test method with Missing pence, Decimal point present
         * */
        mockInput = "£1.p";
        expectedResult = 100;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Buffered zeroes
         * */
        mockInput = "001.61p";
        expectedResult = 161;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Rounding with pence symbol
         * */
        mockInput = "6.235p";
        expectedResult = 624;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }

        /*
         *   Test method with Rounding with pound and pence symbols.
         * */
        mockInput = "£1.256532677p";
        expectedResult = 126;
        if (inputValidator.isValidInput(mockInput)) {
            assertEquals(expectedResult, inputFormatter.formatUserValidInput(mockInput));
        } else {
            fail("Invalid input");
        }
    }
}