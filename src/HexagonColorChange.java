import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class HexagonColorChange {
    private Polygon hexagon;

    public HexagonColorChange() {
        hexagon = new Polygon();
        double radius = 60;
        for (int i = 0; i < 6; i++) {
            double angle = Math.toRadians(i * 60);
            hexagon.getPoints().addAll(
                    Math.cos(angle) * radius,
                    Math.sin(angle) * radius
            );
        }
        hexagon.setFill(Color.DARKGREEN);
    }

    public void changeColor() {
        hexagon.setFill(Color.color(Math.random(), Math.random(), Math.random()));
    }

    public StackPane getNode() {
        return new StackPane(hexagon);
    }
}
