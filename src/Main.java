import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Collections;
import java.io.ObjectInputStream;

/**
 * The Main class ...
 * starts and manages the Application
 */
public class Main extends Application {
    public static int canvasWidth = 479;
    public static int canvasHeight = 266;

    private static Room r;
    private static Stage stage;

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

        Graphics g = new Graphics();
        verticalItems.getChildren().add(g.getCanvas());

        r = new OdysseyRoom();
        r.draw(g);
        g.saveGraphicsContext();

        Button b = new Button("Pika!");
        buttons.getChildren().add(b);
        b.setOnAction(e -> {
            Room room = new PikaDecorator(r);
            setRoom(room);
            g.restoreGraphicsContext();
            r.draw(g);
            b.setDisable(true);
        });

        Button b2 = new Button("3 more plz");
        buttons.getChildren().add(b2);
        b2.setOnAction(e ->{
            Room room = new BowserDecorator(new YoshiCoinDecorator(new KirbyStickerDecorator(new PiranhaDecorator(r))));
            setRoom(room);
            g.restoreGraphicsContext();
            r.draw(g);
            b2.setDisable(true);
        });

        Button resetButton = new Button("RESET");
        buttons.getChildren().add(resetButton);
        resetButton.setOnAction(e ->{
            setRoom(new OdysseyRoom());
            g.restoreGraphicsContext();
            r.draw(g);

            b.setDisable(false);
            b2.setDisable(false);
        });

        verticalItems.getChildren().add(buttons);




        primaryStage.setScene(new Scene(verticalItems, canvasWidth - 10, canvasHeight + 15));
        primaryStage.show();
        stage = primaryStage;
    }

    /**
     * Sets the static Room r variable in Main to the given Room variable
     * @param room Room
     */
    private void setRoom(Room room) {
        r = room;
    }

    /**
     * Closes the Window
     */
    public static void close(){
        stage.close();
    }

    private void compareColors(Graphics g){
        WritableImage i = g.getCanvas().snapshot(null, null);
        PixelReader pxr = i.getPixelReader();
        System.out.println(pxr.getColor(345, 60));
    }
}
