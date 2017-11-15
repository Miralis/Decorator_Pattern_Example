/**
 * Decorator for the Room Interface
 */
public class RoomDecorator implements Room {
    protected Room decoratedRoom;

    public RoomDecorator(Room decoratedRoom){
        this.decoratedRoom = decoratedRoom;
    }

    @Override
    public void draw(Graphics graphics) {
        decoratedRoom.draw(graphics);
    }
}
