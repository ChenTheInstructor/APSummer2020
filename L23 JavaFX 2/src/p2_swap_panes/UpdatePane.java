package p2_swap_panes;

import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class UpdatePane {
	private HBox box1;
	private TextField field1;
	private TextField field2;
	
	public UpdatePane() {
		box1 = new HBox(5);
		field1 = new TextField();
		field1.setPromptText("UPDATE");
		field2 = new TextField();
		box1.getChildren().addAll(field1, field2);
	}
	
	public Pane getPane() {
		return box1;
	}
	
	
}
