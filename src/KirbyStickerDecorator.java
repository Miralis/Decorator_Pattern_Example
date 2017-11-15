import javafx.scene.image.Image;

/**
 * Concrete Decorator extending RoomDecorator for drawing a KirbyS ticker
 */
public class KirbyStickerDecorator extends RoomDecorator{
    public KirbyStickerDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw(Graphics graphics) {
        decoratedRoom.draw(graphics);
        addKirbySticker(graphics);
    }

    /**
     * Draws the kirbySticker.png Image given Graphics.
     */
    private void addKirbySticker(Graphics graphics){
        graphics.getGraphicsContext().drawImage(new Image("/images/kirbySticker.png"), 400, 150);
    }
}
