import javafx.scene.image.Image;

public class PikaDecoration extends RoomDecorator {
    public PikaDecoration(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw() {
        decoratedRoom.draw();
        addPikachu();
    }

    private void addPikachu(){
        Main.graphicsContext.drawImage(new Image("/images/pika.png"), 330, 55);
    }
}