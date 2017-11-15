import javafx.scene.image.Image;

/**
 * Concrete Decorator extending RoomDecorator for drawing a Piranha Plant
 */
public class PiranhaDecorator extends RoomDecorator {
    public PiranhaDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw() {
        decoratedRoom.draw();
        addPiranhaPlant();
    }

    /**
     * Draws the piranhaPlant.png Image onto the static graphicsContext of the Main class.
     */
    private void addPiranhaPlant(){
        Main.graphicsContext.drawImage(new Image("/images/piranhaPlant.png"), 215, 75);
    }
}
