import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class p20 extends Application {
    private static final int INITIAL_FONT_SIZE = 20;
    private static final int BUTTON_SIZE = 60;
    private static final int PADDING = 20;

    private Text messageText;

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPadding(new Insets(PADDING));
        root.setSpacing(10);

        messageText = new Text("Hello, World!");
        messageText.setFont(Font.font("Arial", FontWeight.BOLD, INITIAL_FONT_SIZE));

        Button leftButton = createButton("Left", e -> moveMessageLeft());
        Button rightButton = createButton("Right", e -> moveMessageRight());

        ToggleGroup colorGroup = new ToggleGroup();
        RadioButton redRadio = createRadioButton("Red", colorGroup, e -> changeMessageColor(Color.RED));
        RadioButton greenRadio = createRadioButton("Green", colorGroup, e -> changeMessageColor(Color.GREEN));
        RadioButton blueRadio = createRadioButton("Blue", colorGroup, e -> changeMessageColor(Color.BLUE));

        HBox buttonBox = new HBox(leftButton, rightButton);
        buttonBox.setSpacing(10);

        HBox colorBox = new HBox(redRadio, greenRadio, blueRadio);
        colorBox.setSpacing(10);

        root.getChildren().addAll(messageText, buttonBox, colorBox);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Message App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button createButton(String text, EventHandler<ActionEvent> eventHandler) {
        Button button = new Button(text);
        button.setPrefWidth(BUTTON_SIZE);
        button.setOnAction(eventHandler);
        return button;
    }

    private RadioButton createRadioButton(String text, ToggleGroup group, EventHandler<ActionEvent> eventHandler) {
        RadioButton radioButton = new RadioButton(text);
        radioButton.setToggleGroup(group);
        radioButton.setOnAction(eventHandler);
        return radioButton;
    }

    private void moveMessageLeft() {
        messageText.setTranslateX(messageText.getTranslateX() - 10);
    }

    private void moveMessageRight() {
        messageText.setTranslateX(messageText.getTranslateX() + 10);
    }

    private void changeMessageColor(Color color) {
        messageText.setFill(color);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
