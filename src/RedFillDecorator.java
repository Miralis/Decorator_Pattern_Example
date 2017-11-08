import javafx.scene.paint.Color;

public class RedFillDecorator extends ShapeDecorator {
    public RedFillDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        setRedBorder(decoratedShape);
        decoratedShape.draw();
    }

    private void setRedBorder(Shape decoratedShape){
        Main.graphicsContext.setFill(Color.RED);
    }
}
