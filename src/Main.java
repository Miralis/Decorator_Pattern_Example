import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Main extends Application {
    public static GraphicsContext graphicsContext;
    public static int canvasWidth = 479;
    public static int canvasHeight = 266;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Decorator Demo");
        Group root = new Group();
        Canvas canvas = new Canvas(canvasWidth, canvasHeight);
        graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.save();
        root.getChildren().add(canvas);

        Room r = new OdysseyRoom();
        r.draw();

        Button b = new Button("Pika!");
        root.getChildren().add(b);
        b.setOnAction(e -> {
            Room room = new PikaDecoration(r);
            room.draw();
        });

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
