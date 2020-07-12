package p2_gridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DemoGridPane extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		GridPane root = new GridPane();
		
		TextField nameField = new TextField();
		TextArea outputArea = new TextArea();
		Button hiBtn = new Button("HI");
		Button byeBtn = new Button("Bye");
		hiBtn.setPrefSize(100, 5);
		byeBtn.setPrefSize(100, 5);
		
		root.add(nameField, 0, 0, 2, 1);
		
		root.add(outputArea, 0, 1, 2, 3);
		
		root.add(hiBtn, 0, 4, 1, 1);
		root.add(byeBtn, 1, 4, 1, 1);
		
		root.setVgap(20);
		root.setHgap(250);

		root.setPadding(new Insets(40));
		Scene scene = new Scene(root, 600, 600);
		stage.setScene(scene);
		stage.show();
	}

}
