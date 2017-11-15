import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * The Main class ...
 * starts and manages the Application
 */
public class Main extends Application {
    public static GraphicsContext graphicsContext;
    public static int canvasWidth = 479;
    public static int canvasHeight = 266;

    private Canvas canvas = new Canvas(canvasWidth, canvasHeight);

    private static Room r;

    /**
     * Launches the Application
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Creates the JavaFX window
     * @param primaryStage Stage
     */
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
            Room room = new PikaDecorator(r);
            setRoom(room);
            r.draw();
            b.setDisable(true);
        });

        Button b2 = new Button("3 more plz");
        buttons.getChildren().add(b2);
        b2.setOnAction(e ->{
            Room room = new YoshiCoinDecorator(new KirbyStickerDecorator(new PiranhaDecorator(r)));
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

    /**
     * Sets the static Room r variable in Main to the given Room variable
     * @param room Room
     */
    private void setRoom(Room room) {
        r = room;
    }
}
