import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    }
}