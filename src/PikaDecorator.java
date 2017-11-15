import javafx.scene.image.Image;

/**
 * Concrete Decorator extending RoomDecorator for drawing a Pikachu plushy
 */
public class PikaDecorator extends RoomDecorator {
    public PikaDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw(Graphics graphics) {
        decoratedRoom.draw(graphics);
        addPikachu(graphics);
    }

    /**
     * Draws the pika.png Image onto the given Graphics.
     */
    private void addPikachu(Graphics graphics){
        graphics.getGraphicsContext().drawImage(new Image("/images/pika.png"), 330, 55);
    }
}
