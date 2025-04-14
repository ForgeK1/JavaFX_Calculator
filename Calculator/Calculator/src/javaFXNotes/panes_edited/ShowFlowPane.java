package javaFXNotes.panes_edited;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane and set its properties
		FlowPane pane = new FlowPane();
		//pane.setOrientation(Orientation.HORIZONTAL);
		pane.setOrientation(Orientation.VERTICAL);

		//new Insets(top_value, right_value, bottom_value, left_value)
		Insets padding = new Insets(50, 50, 50, 50);
		//Insets padding = new Insets(50);
		pane.setPadding(padding);
		//pane.setStyle("-fx-background-color: blue");

		pane.setHgap(20);
		pane.setVgap(20);

		// Place nodes in the pane
		
		pane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("MI:"));

		TextField tfMi = new TextField();

		tfMi.setPrefColumnCount(1);

		pane.getChildren().addAll(tfMi, 
				new Label("Last Name:"),
				new TextField());

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 500, 500);
		primaryStage.setTitle("ShowFlowPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		//primaryStage.setResizable(false);
		primaryStage.show(); // Display the stage
	}

	public static void main(String[] args) {
		launch(args);
	}
}
