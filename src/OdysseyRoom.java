import javafx.scene.image.Image;

/**
 * Class for the Room of the Odyssey (see Super Mario Odyssey)
 */
public class OdysseyRoom implements Room {

    public OdysseyRoom() {
    }

    /**
     * Draws the Room.png Image onto the given Graphics.
     */
    @Override
    public void draw(Graphics graphics) {
        graphics.getGraphicsContext().drawImage(new Image("/images/Room.png"), 0, 0);
    }
}
