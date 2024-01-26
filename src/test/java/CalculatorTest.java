import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    @DisplayName("플러스 계산")
    void plustest(){

        Calculator cal = new Calculator();

        int plusresult = cal.plus(4,3);

        Assertions.assertEquals(7,plusresult);

    }
}
