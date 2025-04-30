import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(20);

        ImageHover imageHover = new ImageHover();
        CircleBounce circleBounce = new CircleBounce();
        SquareMove squareMove = new SquareMove();
        HexagonColorChange hexagon = new HexagonColorChange();

        root.getChildren().addAll(
                imageHover.getNode(),
                circleBounce.getNode(),
                squareMove.getNode(),
                hexagon.getNode()
        );

        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("Ngjarje dhe Animime");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Event që shkon te hexagon
        scene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.SPACE) {
                hexagon.changeColor();
            }
        });
    }

    public static void main(String[] args) {
        launch();
    }
}
