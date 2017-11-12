import javafx.scene.image.Image;

public class KirbyStickerDecorator extends RoomDecorator{
    public KirbyStickerDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw() {
        decoratedRoom.draw();
        addKirbySticker();
    }

    private void addKirbySticker(){
        Main.graphicsContext.drawImage(new Image("/images/kirbySticker.png"), 400, 150);
    }
}
