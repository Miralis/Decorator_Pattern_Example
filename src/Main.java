import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public static GraphicsContext graphicsContext;
    public static int canvasWidth = 479;
    public static int canvasHeight = 266;

    private static Room r;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Decorator Demo");

        VBox verticalItems = new VBox(0);
        HBox buttons = new HBox(5);

        Canvas canvas = new Canvas(canvasWidth, canvasHeight);
        graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.save();
        verticalItems.getChildren().add(canvas);

        r = new OdysseyRoom();
        r.draw();

        Button b = new Button("Pika!");
        buttons.getChildren().add(b);
        b.setOnAction(e -> {
            Room room = new PikaDecoration(r);
            setRoom(room);
            r.draw();
        });

        Button b2 = new Button("3 more plz");
        buttons.getChildren().add(b2);
        b2.setOnAction(e ->{
            Room room = new YoshiCoinDecoration(new KirbyStickerDecoration(new PiranhaDecoration(r)));
            setRoom(room);
            r.draw();
        });

        verticalItems.getChildren().add(buttons);

        primaryStage.setScene(new Scene(verticalItems));
        primaryStage.show();
    }

    private void setRoom(Room room){
        r = room;
    }
}
