import javafx.animation.TranslateTransition;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class CircleBounce {
    private Circle circle;

    public CircleBounce() {
        circle = new Circle(50, Color.ORANGE);
        circle.setOnMouseClicked(e -> bounce());
    }

    private void bounce() {
        TranslateTransition tt = new TranslateTransition(Duration.seconds(0.5), circle);
        tt.setByY(-50);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);
        tt.play();
    }

    public StackPane getNode() {
        return new StackPane(circle);
    }
}
