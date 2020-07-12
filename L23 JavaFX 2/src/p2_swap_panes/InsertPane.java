package p2_swap_panes;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class InsertPane {
	private GridPane gridPane;
	private TextField titleField;
	private TextField isbnField;
	private TextField priceField;
	private TextField authorField;

	private Button okBtn;
	private Button cancelBtn;

	public InsertPane(BookBag bookBag) {
		gridPane = new GridPane();

		titleField = new TextField();
		titleField.setPromptText("TITLE");
		isbnField = new TextField();
		isbnField.setPromptText("ISBN");
		authorField = new TextField();
		authorField.setPromptText("AUTHOR");
		priceField = new TextField();
		priceField.setPromptText("PRICE");

		okBtn = new Button("OK");
		cancelBtn = new Button("Cancel");

		okBtn.setPrefSize(100, 10);
		cancelBtn.setPrefSize(100, 10);

		gridPane.add(titleField, 0, 0);
		gridPane.add(isbnField, 1, 0);
		gridPane.add(authorField, 0, 1);
		gridPane.add(priceField, 1, 1);

		gridPane.add(okBtn, 0, 2);
		gridPane.add(cancelBtn, 1, 2);

		gridPane.setVgap(10);
		gridPane.setHgap(10);

		gridPane.setPadding(new Insets(20));

		okBtn.setOnAction(e -> {
			String title = titleField.getText();
			String isbn = isbnField.getText();
			String author = authorField.getText();
			double price = Double.parseDouble(priceField.getText());
			Book newBook = new Book(title, isbn, author, price);
			bookBag.insert(newBook);
			bookBag.display();
			clearAll();

		});
		
		cancelBtn.setOnAction(e -> {
			clearAll();
		});

		
	}
	
	public void clearAll() {
		titleField.clear();
		isbnField.clear();
		authorField.clear();
		priceField.clear();
	}

	public Pane getPane() {
		return gridPane;
	}

}
