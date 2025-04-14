package javaFXNotes.basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXBasicStructure extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Make all components (nodes)
		Label lblHelloWorld = new Label("Hello World");
		
		//Add components to a layout pane.
		StackPane pane = new StackPane();
		pane.getChildren().add(lblHelloWorld);
		
		//Create the Scene for the window
		Scene scene = new Scene(pane, 500, 400);
		
		//Setup the primary Stage.
		primaryStage.setScene(scene);
		primaryStage.setTitle("My First JavaFX Program");
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
