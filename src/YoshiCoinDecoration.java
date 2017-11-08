import javafx.scene.image.Image;

public class YoshiCoinDecoration extends RoomDecorator{
    public YoshiCoinDecoration(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw() {
        decoratedRoom.draw();
        addYoshiCoin();
    }

    private void addYoshiCoin(){
        Main.graphicsContext.drawImage(new Image("/images/yoshiCoin.png"), 70, 20);
    }
}
