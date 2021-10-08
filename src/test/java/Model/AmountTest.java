package Model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmountTest {

    private Amount amount;

    @BeforeEach
    void setUp() {
        amount = new Amount();
    }

    @Test
    void returnExpectedMinimumCoinsDenominations() {
        /*
         *   Test method with multiple digit
         * */
        // String mockInput = "123p";
        long formattedValue = 123;
        String expectedResult = "1 x £1, 1 x 20p, 1 x 2p, 1 x 1p";


        amount.setFormattedAmount(formattedValue);
        assertEquals(expectedResult.replaceAll("\\s+",""), amount.CalculateMinCoinDenominations().replaceAll("\\s+",""));


    }


}