import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DNItest {

    @ParameterizedTest
    @CsvSource({
            "49039754, M",
            "14095874, W",
            "22589114, F",
            "12345678, V",
            "49039752, Q",
            "36058233, T",
            "57896441, H",
            "85633423, K",
            "77412558, M",
            "66523888, V"
    })
    void testCalculateLetter(int dniNumber, char expectedLetter) {
        DNICalculation dni = new DNICalculation(dniNumber);
        char actualLetter = dni.calculateLetter();
        assertEquals(expectedLetter, actualLetter);
    }


}
