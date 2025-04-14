package application;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

//Description: A class that builds and provides a user interface in the form of panes and scenes
public class UserInterface 
{
	//Private Variables
	
	StackPane rootPane; 		//A root pane where all other panes will stack on top of
	Scene rootScene;			//A root scene that will be used by the stage manager
	SoundManager soundManager;  //A variable to utilize and manage audio files
	
	//Constructors
	
	/*Creates an instance of a user interface
	  	Note: 
	  		  (1) An instance of Operations was not created because that is a static class
	  		  (2) rootPane and rootScene are instantiated in the setUpScene() method which
	  		  	  is called in the StageManager class*/
	public UserInterface(SoundManager soundManager)
	{
		this.soundManager = soundManager;
	}
	
	//Methods
	
	//A method to set up the root scene that will showcase the application's user interface
	public void setUpScene()
	{
		//Creates the root pane where all the other panes will stack onto
		this.rootPane = new StackPane();
		
		//Changes background of the root pane
		this.rootPane.setStyle("-fx-background-color: black");
		
		/*Creates a scene to utilize the the root pane to our scene and its specific dimensions
		  for the calculator application
		  	Note: This program is based on the iPhone 14 Pro Max resolution of 1179×2556, 
		  		  but we’re using a quarter of that size to make it more suitable for 
		  		  typical computer displays*/
		this.rootScene = new Scene(rootPane, 295, 639);
	}
	
	//A method to handle user events that dynamically update the user interface
	public void eventHandler()
	{
		
	}
	
	//Getter and setter methods
	
	public Scene getRootScene()
	{
		return this.rootScene;
	}
	
	public void setRootScene(Scene newRootScene) 
	{
		this.rootScene = newRootScene;
	}
}
