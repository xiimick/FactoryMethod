package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransportFactoryTest {

    @Test
    public void testCreateCar() {
        TransportFactory factory = new CarFactory();
        Transport car = factory.createTransport();
        assertTrue(car instanceof Car);
    }

    @Test
    public void testCreatePlane() {
        TransportFactory factory = new PlaneFactory();
        Transport plane = factory.createTransport();
        assertTrue(plane instanceof Plane);
    }
}
