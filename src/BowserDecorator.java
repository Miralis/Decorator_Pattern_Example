import javafx.scene.image.Image;

public class BowserDecorator extends RoomDecorator {
    public BowserDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void draw(Graphics g) {
        decoratedRoom.draw(g);
        addBowserPlush(g);
    }

    private void addBowserPlush(Graphics g){
        g.getGraphicsContext().drawImage(new Image("/images/bowserPlush.png"), 25, 160);
    }
}
