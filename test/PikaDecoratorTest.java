import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JfxTestRunner.class)
public class PikaDecoratorTest{

    private Room r;
    private Graphics g;

    private PixelReader pixelReader;
    private WritableImage writableImage;

    @Before
    public void setUp() throws Exception {
        String[] s = {""};
        Main.main(s);

        r = new PikaDecorator(new OdysseyRoom());
        g = new Graphics();
        writableImage = g.getCanvas().snapshot(null, null);
        pixelReader = writableImage.getPixelReader();
        System.out.println(pixelReader.getColor(355, 70));
    }

    @After
    public void tearDown() throws Exception {
        r = null;
        g = null;
    }

    @Test
    public void draw() throws Exception {

        r.draw(g);
//        System.out.println(pixelReader.getColor(355, 70));

    }
}