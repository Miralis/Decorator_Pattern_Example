import javafx.scene.image.Image;

/**
 * Class for the Room of the Odyssey (see Super Mario Odyssey)
 */
public class OdysseyRoom implements Room {

    public OdysseyRoom() {
    }

    /**
     * Draws the Room.png Image onto the static graphicsContext of the Main class.
     */
    @Override
    public void draw() {
        Main.graphicsContext.drawImage(new Image("/images/Room.png"), 0, 0);
    }
}
