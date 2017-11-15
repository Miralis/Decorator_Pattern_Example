import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PikaDecoratorTest{
    private Room r;
    private Graphics g;

    @Before
    public void setUp() throws Exception {
        String[] s = {""};
        Main.main(s);
        r = new PikaDecorator(new OdysseyRoom());
        g = new Graphics();
    }

    @After
    public void tearDown() throws Exception {
        r = null;
        g = null;
    }

    @Test
    public void draw() throws Exception {
        r.draw(g);
    }
}