package application;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class UserInterface 
{
	//Private Variables
	
	StackPane rootPane;
	Scene rootScene;
	Operations operations;
	SoundManager soundManager;
	
	//Constructors
	
	public UserInterface(Operations operations, SoundManager soundManager)
	{
		this.operations = operations;
		this.soundManager = soundManager;
	}
	
	//Methods
	
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
