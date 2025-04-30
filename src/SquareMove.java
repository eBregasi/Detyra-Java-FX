import javafx.animation.TranslateTransition;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class SquareMove {
    private Rectangle square;

    public SquareMove() {
        // Krijo një katror me ngjyrë blu
        square = new Rectangle(100, 100, Color.BLUE);

        // Lidh ngjarjen e miut për lëvizjen e katrorit
        square.setOnMouseMoved(e -> moveRandomly());
    }

    // Funksioni për të lëvizur katrorin në mënyrë rastësore
    private void moveRandomly() {
        // Krijo një animim për lëvizjen
        TranslateTransition tt = new TranslateTransition(Duration.seconds(1), square);

        // Lëvizje rastësore në të gjitha drejtimet
        double randomX = Math.random() * 200 - 100; // Nga -100 në 100 (rasti në X)
        double randomY = Math.random() * 200 - 100; // Nga -100 në 100 (rasti në Y)

        tt.setByX(randomX); // Lëvizje në X
        tt.setByY(randomY); // Lëvizje në Y

        tt.play(); // Starto animimin
    }

    public StackPane getNode() {
        return new StackPane(square);
    }
}
