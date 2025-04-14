package javaFXNotes.panes_edited;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

//Define a custom pane to hold a label in the center of the pane
public class CustomPane extends StackPane {
	
	public CustomPane(String title) {
		super.getChildren().add(new Label(title));
		super.setStyle("-fx-border-color: red; -fx-background-color: lightblue");
		super.setPadding(new Insets(20));
	}
}