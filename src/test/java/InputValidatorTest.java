import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

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

    }
}