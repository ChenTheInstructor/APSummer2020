package p2_swap_panes;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoSwapPanes extends Application {

	final ArrayList<Pane> list = new ArrayList<>();

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		BookBag bookBag = new BookBag(100000);

		VBox root = new VBox(10);

		HBox btnBox = new HBox(30);

		Button insertBtn = new Button("INSERT");
		insertBtn.setOnAction(e -> {
			InsertPane newPane = new InsertPane(bookBag);
			Pane gridPane = newPane.getPane();
			gridPane.setPadding(new Insets(30, 10, 0, 93));
			root.getChildren().clear();
			root.getChildren().addAll(btnBox, gridPane);
		});

		Button searchBtn = new Button("SEARCH");
		searchBtn.setOnAction(e -> {
			HBox newBox = (HBox) new SearchPane().getPane();
			newBox.setPadding(new Insets(30, 10, 0, 93));
			root.getChildren().clear();
			root.getChildren().addAll(btnBox, newBox);
		});

		Button removeBtn = new Button("REMOVE");
		removeBtn.setOnAction(e -> {
			HBox newBox = (HBox) new RemovePane().getPane();
			newBox.setPadding(new Insets(30, 10, 0, 93));
			root.getChildren().clear();
			root.getChildren().addAll(btnBox, newBox);
		});

		Button updateBtn = new Button("UPDATE");
		updateBtn.setOnAction(e -> {
			HBox newBox = (HBox) new UpdatePane().getPane();
			newBox.setPadding(new Insets(30, 10, 0, 93));
			root.getChildren().clear();
			root.getChildren().addAll(btnBox, newBox);
		});

		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(insertBtn, searchBtn, removeBtn, updateBtn);

		root.getChildren().add(btnBox);
		root.setPadding(new Insets(40));
		Scene scene = new Scene(root, 600, 300);
		stage.setScene(scene);
		stage.show();
	}

}
