import javafx.scene.image.Image;

/**
 * Concrete Decorator extending RoomDecorator for drawing a Yoshi Coin
 */
public class YoshiCoinDecorator extends RoomDecorator{
    public YoshiCoinDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw(Graphics graphics) {
        decoratedRoom.draw(graphics);
        addYoshiCoin(graphics);
    }

    /**
     * Draws the yoshiCoin.png Image onto the given Graphics.
     */
    private void addYoshiCoin(Graphics graphics){
        graphics.getGraphicsContext().drawImage(new Image("/images/yoshiCoin.png"), 70, 20);
    }
}
