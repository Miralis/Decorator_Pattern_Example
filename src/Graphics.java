import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * Graphics class to easier manage the Canvas
 */
public class Graphics {
    private Canvas canvas;
    private GraphicsContext graphicsContext;

    /**
     * Creates a new Canvas, saves its graphicsContext inside a variable and saves its state.
     */
    public Graphics() {
        canvas = new Canvas(Main.canvasWidth, Main.canvasHeight);
        graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.save();
    }

    /**
     * Returns the Canvas
     * @return Canvas
     */
    public Canvas getCanvas() {
        return canvas;
    }

    /**
     * Sets the Canvas
     * @param canvas Canvas
     */
    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    /**
     * Returns the GraphicsContext of the Canvas
     * @return GraphicsContext
     */
    public GraphicsContext getGraphicsContext() {
        return graphicsContext;
    }

    /**
     * Sets the GraphicsContext
     * @param graphicsContext GraphicsContext
     */
    public void setGraphicsContext(GraphicsContext graphicsContext) {
        this.graphicsContext = graphicsContext;
    }

    /**
     * Calls the save() Method of the GraphicsContext
     */
    public  void saveGraphicsContext(){
        this.graphicsContext.save();
    }

    /**
     * Calls the restore() Method of the GraphicsContext
     */
    public void restoreGraphicsContext(){
        this.graphicsContext.restore();
    }
}
