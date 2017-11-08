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
        primaryStage.setResizable(false);

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
            b.setDisable(true);
        });

        Button b2 = new Button("3 more plz");
        buttons.getChildren().add(b2);
        b2.setOnAction(e ->{
            Room room = new YoshiCoinDecoration(new KirbyStickerDecoration(new PiranhaDecoration(r)));
            setRoom(room);
            r.draw();
            b2.setDisable(true);
        });

        Button resetButton = new Button("RESET");
        buttons.getChildren().add(resetButton);
        resetButton.setOnAction(e ->{
            setRoom(new OdysseyRoom());
            r.draw();

            b.setDisable(false);
            b2.setDisable(false);
        });

        verticalItems.getChildren().add(buttons);

        primaryStage.setScene(new Scene(verticalItems, canvasWidth - 10, canvasHeight + 15));
        primaryStage.show();
    }

    private void setRoom(Room room){
        r = room;
    }
}
