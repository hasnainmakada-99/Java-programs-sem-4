import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class p19 extends Application {
    private static final int CIRCLE_RADIUS = 50;
    private Circle circle;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        circle = new Circle(CIRCLE_RADIUS);
        circle.setCenterX(250);
        circle.setCenterY(250);
        circle.setFill(Color.BLUE);

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 500, 500);
        scene.setOnMousePressed(event -> handleMousePress());
        scene.setOnMouseReleased(event -> handleMouseRelease());

        primaryStage.setTitle("Change Circle Color");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleMousePress() {
        circle.setFill(Color.RED);
    }

    private void handleMouseRelease() {
        circle.setFill(Color.BLUE);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
