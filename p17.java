import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class p17 extends Application {
    private static final int BOARD_SIZE = 3;
    private static final String EMPTY_CELL = " ";
    private static final String X_CELL = "X";
    private static final String O_CELL = "O";
    private static final String X_IMAGE_PATH = "X.gif";
    private static final String O_IMAGE_PATH = "O.gif";

    private GridPane gridPane;

    @Override
    public void start(Stage primaryStage) {
        gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        initializeBoard();

        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Tic-Tac-Toe Board");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initializeBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                ImageView imageView = getRandomCellImage();
                gridPane.add(imageView, col, row);
            }
        }
    }

    private ImageView getRandomCellImage() {
        ImageView imageView = new ImageView();
        String cellType = getRandomCellType();
        String imagePath = getImagePath(cellType);
        Image image = new Image(imagePath);
        imageView.setImage(image);
        imageView.setFitWidth(100);
        imageView.setFitHeight(100);
        return imageView;
    }

    private String getRandomCellType() {
        Random random = new Random();
        int randomNum = random.nextInt(3);
        if (randomNum == 0) {
            return EMPTY_CELL;
        } else if (randomNum == 1) {
            return X_CELL;
        } else {
            return O_CELL;
        }
    }

    private String getImagePath(String cellType) {
        if (cellType.equals(X_CELL)) {
            return X_IMAGE_PATH;
        } else if (cellType.equals(O_CELL)) {
            return O_IMAGE_PATH;
        } else {
            // Return a path to an empty cell image
            return "";
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
