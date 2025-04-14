package javaFXNotes;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Label; 
import javafx.scene.layout.StackPane; 
import javafx.stage.Stage; 
/**
 * Class for testing whether or not your JavaFX code works.
 */
public class JavaFXTest extends Application { 

	@Override 
	public void start(Stage primaryStage) { 
		Label l = new Label("Hello, JavaFX World!"); 
		Scene scene = new Scene(new StackPane(l), 600, 600); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	} 
	
	//Main method required to run in Eclipse.
	public static void main(String[] args) { 
		Application.launch(); 
	} 
} 