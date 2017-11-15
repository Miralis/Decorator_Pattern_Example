import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * Concrete Decorator extending RoomDecorator for drawing a Piranha Plant
 */
public class PiranhaDecorator extends RoomDecorator {
    public PiranhaDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw(Graphics graphics) {
        decoratedRoom.draw(graphics);
        addPiranhaPlant(graphics);
    }

    /**
     * Draws the piranhaPlant.png Image onto the given Graphics.
     */
    private void addPiranhaPlant(Graphics graphics){
        graphics.getGraphicsContext().drawImage(new Image("/images/piranhaPlant.png"), 215, 75);
    }
}
