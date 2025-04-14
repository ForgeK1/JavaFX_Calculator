package javaFXNotes.panes_edited;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ShowHBoxVBox extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a border pane 
    BorderPane pane = new BorderPane();

    // Place nodes in the pane
    pane.setTop(new FlagPane(20)); 
    pane.setLeft(getVBox());
   
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    Stage stage1 = new Stage();
    stage1.setTitle("ShowHBoxVBox"); // Set the stage title
    stage1.setScene(scene); // Place the scene in the stage
    stage1.show(); // Display the stage
  }
 
  private VBox getVBox() {
    VBox vBox = new VBox(15);
    vBox.setPadding(new Insets(15));
    vBox.getChildren().add(new Label("Courses"));
    
    Label[] courses = {new Label("CSCI 1301"), 
    		           new Label("CSCI 1302"), 
    		           new Label("CSCI 2410"), 
    		           new Label("CSCI 3720")};

    for (Label course: courses) {
      VBox.setMargin(course, new Insets(0, 0, 0, 15));
      vBox.getChildren().add(course);
    }
    
    return vBox;
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 
