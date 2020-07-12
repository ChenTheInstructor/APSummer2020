package p2_gridPane2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DemoGridPane extends Application {

	Button[][] buttons;
	int[] location = new int[2];

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		final int NUMBER_OF_ROWS = 10;
		final int NUMBER_OF_COLS = 10;

		buttons = new Button[NUMBER_OF_ROWS][NUMBER_OF_COLS];

		for (int i = 0; i < NUMBER_OF_COLS; i++) {
			for (int j = 0; j < NUMBER_OF_ROWS; j++) {
				buttons[i][j] = new Button();
				buttons[i][j].setMaxSize(50, 50);
				buttons[i][j].setMinSize(50, 50);
			}
		}

		GridPane root = new GridPane();

		for (int i = 0; i < NUMBER_OF_COLS; i++) {
			for (int j = 0; j < NUMBER_OF_ROWS; j++) {
				root.add(buttons[j][i], j, i);
			}
		}

		buttons[0][0].setOnAction(e -> {
			show(0, 0, "Bomb");
			System.out.println(Arrays.toString(location));
		});

		buttons[0][1].setOnAction(e -> {
			show(0, 1, "lawn");
			System.out.println(Arrays.toString(location));
		});

		root.setPadding(new Insets(40));
		Scene scene = new Scene(root, 580, 580);
		stage.setScene(scene);
		stage.show();
	}

	public void show(int c, int r, String what) {
		FileInputStream input = null;
		try {
			input = new FileInputStream(what+".png");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);

		buttons[c][r].setGraphic(imageView);
		location[0] = c;
		location[1] = r;
	}
	
	
}
