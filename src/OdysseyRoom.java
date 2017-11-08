import javafx.scene.image.Image;

public class OdysseyRoom implements Room {

    public OdysseyRoom() {
    }

    @Override
    public void draw() {
        Main.graphicsContext.drawImage(new Image("/images/Room.png"), 0, 0);
    }
}
