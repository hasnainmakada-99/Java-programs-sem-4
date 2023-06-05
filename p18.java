import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class p18 extends Application {
    private static final int CIRCLE_RADIUS = 50;
    private static final int CIRCLE_INITIAL_X = 250;
    private static final int CIRCLE_INITIAL_Y = 250;
    private static final int CIRCLE_SPEED = 10;

    private Circle circle;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        circle = new Circle(CIRCLE_RADIUS);
        circle.setCenterX(CIRCLE_INITIAL_X);
        circle.setCenterY(CIRCLE_INITIAL_Y);
        circle.setFill(Color.RED);

        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 500, 500);
        scene.setOnKeyPressed(event -> handleKeyPress(event.getCode()));

        primaryStage.setTitle("Move Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleKeyPress(KeyCode keyCode) {
        switch (keyCode) {
            case UP:
                moveCircle(0, -CIRCLE_SPEED);
                break;
            case DOWN:
                moveCircle(0, CIRCLE_SPEED);
                break;
            case LEFT:
                moveCircle(-CIRCLE_SPEED, 0);
                break;
            case RIGHT:
                moveCircle(CIRCLE_SPEED, 0);
                break;
        }
    }

    private void moveCircle(double deltaX, double deltaY) {
        double newX = circle.getCenterX() + deltaX;
        double newY = circle.getCenterY() + deltaY;

        // Ensure the circle does not move outside the scene bounds
        if (newX >= CIRCLE_RADIUS && newX <= (circle.getParent().getBoundsInLocal().getWidth() - CIRCLE_RADIUS)) {
            circle.setCenterX(newX);
        }

        if (newY >= CIRCLE_RADIUS && newY <= (circle.getParent().getBoundsInLocal().getHeight() - CIRCLE_RADIUS)) {
            circle.setCenterY(newY);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
