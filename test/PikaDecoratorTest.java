import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PikaDecoratorTest {
    private Room r;

    @Before
    public void setUp() throws Exception {
        r = new PikaDecorator(new OdysseyRoom());
    }

    @After
    public void tearDown() throws Exception {
        r = null;
    }

    @Test
    public void draw() throws Exception {

    }
}