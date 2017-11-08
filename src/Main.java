import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

import java.util.concurrent.ThreadLocalRandom;

public class Main extends Application{
    public static GraphicsContext graphicsContext;
    public static int canvasWidth = 800;
    public static int canvasHeight = 600;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Decorator Demo");
        primaryStage.setResizable(false);
        Group root = new Group();
        Canvas canvas = new Canvas(canvasWidth, canvasHeight);
        graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.save();
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();



        Shape r = new RedFillDecorator(new Rectangle(150, 100));
        r.draw();

        Shape c = new Circle(50);
        c.draw();
    }

    public static int getRandomNumber(int bound){
        return ThreadLocalRandom.current().nextInt(bound);
    }
}
