import javafx.scene.image.Image;

/**
 * Concrete Decorator extending RoomDecorator for drawing a Pikachu plushy
 */
public class PikaDecorator extends RoomDecorator {
    public PikaDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw() {
        decoratedRoom.draw();
        addPikachu();
    }

    /**
     * Draws the pika.png Image onto the static graphicsContext of the Main class.
     */
    private void addPikachu(){
        Main.graphicsContext.drawImage(new Image("/images/pika.png"), 330, 55);
    }
}
