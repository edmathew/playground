package pt.ejpm.services.helloWorld;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author ejpmateus
 */
public class TestHelloWorldService {

    @Test
    public void serviceShouldSayHelloWorld() {
        assertEquals(new HelloWorldServiceImpl().sayHello(), "Hello World");
    }
}
