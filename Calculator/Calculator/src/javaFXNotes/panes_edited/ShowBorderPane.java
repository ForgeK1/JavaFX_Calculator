package javaFXNotes.panes_edited;


import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ShowBorderPane extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a border pane 
		BorderPane pane1 = new BorderPane();
	
		// Place nodes in the pane
		pane1.setTop(new CustomPane("Top")); 
		pane1.setRight(new CustomPane("Right"));
		pane1.setBottom(new CustomPane("Bottom"));
		pane1.setLeft(new CustomPane("Left"));
		//pane.setCenter(new CustomPane("Center"));
		
		pane1.setCenter(createGridPane()); 
		
//		StackPane overallPane = new StackPane();
//		BorderPane pane2 = pane1;
//		pane2.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
		
//		overallPane.getChildren().add(pane1);
//		overallPane.getChildren().add(pane2);

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane1);
		primaryStage.setTitle("ShowBorderPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/**
	 * The main method is only needed for the IDE with limited
	 * JavaFX support. Not needed for running from the command line.
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	public static GridPane createGridPane() {
		// Create a pane and set its properties
	    GridPane gpane = new GridPane();
	    gpane.setAlignment(Pos.CENTER);
	    gpane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
	    gpane.setHgap(10);
	    gpane.setVgap(10);
	    
	    // Place nodes in the pane
	    gpane.add(new Label("First Name:"), 0, 0);
	    gpane.add(new TextField(), 1, 0);
	    
	    TextField tfMI = new TextField();
	
	    gpane.add(new Label("MI:"), 0, 1); 
	    gpane.add(tfMI, 1, 1);
	    gpane.add(new Label("Last Name:"), 0, 2);
	    gpane.add(new TextField(), 1, 2);
	    Button btAdd = new Button("Add Name");
	    gpane.add(btAdd, 1, 3);
	    GridPane.setHalignment(btAdd, HPos.RIGHT);
	    
	    return gpane;
	}
} 









