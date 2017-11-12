import javafx.scene.image.Image;

public class PiranhaDecorator extends RoomDecorator {
    public PiranhaDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw() {
        decoratedRoom.draw();
        addPiranhaPlant();
    }

    private void addPiranhaPlant(){
        Main.graphicsContext.drawImage(new Image("/images/piranhaPlant.png"), 215, 75);
    }
}
