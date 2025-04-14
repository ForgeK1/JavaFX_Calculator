package javaFXNotes.panes_edited;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class FlagPane extends HBox {

	public FlagPane(double value) {
		super(value);
		this.init();
	}




	private void init() {
		//HBox hBox = new HBox(20); 
		super.setPadding(new Insets(15));
		super.setStyle("-fx-background-color: gold");
		super.getChildren().add(new Button("Computer Science"));
		super.getChildren().add(new Button("Chemistry"));
		ImageView imageView = new ImageView(new Image("images/us.gif"));
		super.getChildren().add(imageView);

	}
}
