import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

public class ImageHover {
    private ImageView imageView;

    public ImageHover() {
        // Zëvendëso me path-in tënd lokal nëse do
        imageView = new ImageView(new Image(getClass().getResource("/images/imazhi.jpg").toExternalForm()));
        imageView.setFitWidth(150);
        imageView.setFitHeight(150);
        imageView.setPreserveRatio(true);

        imageView.setOnMouseEntered(e -> imageView.setOpacity(1));
        imageView.setOnMouseExited(e -> imageView.setOpacity(0.3));
        imageView.setOpacity(0.3);
    }

    public StackPane getNode() {
        return new StackPane(imageView);
    }
}
