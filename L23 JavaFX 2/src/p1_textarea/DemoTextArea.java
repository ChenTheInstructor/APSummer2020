package p1_textarea;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DemoTextArea extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		TextField nameField = new TextField();
		nameField.setMaxSize(200, 30);
		
		TextField streetNumberField = new TextField();
		streetNumberField.setMaxSize(50, 30);
		
		TextField streetNameField = new TextField();
		streetNameField.setMaxSize(150, 30);
		
		TextField cityField = new TextField();
		TextField stateField = new TextField();
		TextField zipField = new TextField();
		
		
		
		HBox streetNumberAndNameBox = new HBox(10);
		streetNumberAndNameBox.getChildren().addAll(streetNumberField, streetNameField);
		
		HBox cityAndStateAndZipBox = new HBox(10);
		cityAndStateAndZipBox.getChildren().addAll(cityField, stateField, zipField);
		
		VBox inputBox = new VBox(20);
//		inputBox.setAlignment(Pos.CENTER);
		inputBox.getChildren().addAll(nameField, streetNumberAndNameBox, cityAndStateAndZipBox);
		
		HBox buttonBox = new HBox(5);
		buttonBox.setAlignment(Pos.CENTER);
		Button insertBtn = new Button("INSERT");
		Button searchBtn = new Button("SEARCH");
		Button removeBtn = new Button("REMOVE");
		Button updateBtn = new Button("UPDATE");
		
		buttonBox.getChildren().addAll(insertBtn, searchBtn, removeBtn, updateBtn);
		
		TextArea area1 = new TextArea();
	
		
		HBox outputBox = new HBox();
		outputBox.setAlignment(Pos.CENTER);
		outputBox.getChildren().add(area1);
		
		
		
		VBox root = new VBox(10);
		root.setAlignment(Pos.CENTER);
//		VBox.setMargin(outputBox, new Insets(30));
//		VBox.setMargin(buttonBox, new Insets(20));
//		VBox.setMargin(nameField, new Insets(30));
		root.setPadding(new Insets(20, 20, 30, 30));
		
		root.getChildren().addAll(inputBox, outputBox, buttonBox);
		
		Scene scene = new Scene(root, 400, 300);
		stage.setScene(scene);
		stage.show();
	}

}
