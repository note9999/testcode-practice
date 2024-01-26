import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class CarTest {

    @Test
    @DisplayName("car moved success!!!!!")

    void car_moving_orderd() {
       // given
        int orderCount = 10;
        Car car = new Car();

        //when
        car.moveOrder(orderCount);
        int result = car.getPositon();

        //then
        Assertions.assertEquals(result,orderCount);

    }
}
