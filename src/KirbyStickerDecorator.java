import javafx.scene.image.Image;

/**
 * Concrete Decorator extending RoomDecorator for drawing a KirbyS ticker
 */
public class KirbyStickerDecorator extends RoomDecorator{
    public KirbyStickerDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw() {
        decoratedRoom.draw();
        addKirbySticker();
    }

    /**
     * Draws the kirbySticker.png Image onto the static graphicsContext of the Main class.
     */
    private void addKirbySticker(){
        Main.graphicsContext.drawImage(new Image("/images/kirbySticker.png"), 400, 150);
    }
}
