import javafx.scene.image.Image;

/**
 * Concrete Decorator extending RoomDecorator for drawing a Yoshi Coin
 */
public class YoshiCoinDecorator extends RoomDecorator{
    public YoshiCoinDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw() {
        decoratedRoom.draw();
        addYoshiCoin();
    }

    /**
     * Draws the yoshiCoin.png Image onto the static graphicsContext of the Main class.
     */
    private void addYoshiCoin(){
        Main.graphicsContext.drawImage(new Image("/images/yoshiCoin.png"), 70, 20);
    }
}
