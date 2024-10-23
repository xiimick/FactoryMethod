package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlaneTest {

    @Test
    public void testPlaneMove() {
        Plane plane = new Plane();
        assertDoesNotThrow(() -> plane.move());
    }
}
