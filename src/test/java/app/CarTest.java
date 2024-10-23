package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testCarMove() {
        Car car = new Car();
        assertDoesNotThrow(() -> car.move());
    }
}
