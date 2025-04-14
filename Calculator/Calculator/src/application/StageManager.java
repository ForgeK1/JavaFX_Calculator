package application;
	
import javafx.application.Application;
import javafx.stage.Stage;

//Description: A class that manages the startup and status of the application
public class StageManager extends Application 
{
	/*A method called automatically after launch() is invoked from the main() method below, 
	  which is responsible for setting up the application's scene and primary stage*/
	@Override
	public void start(Stage primaryStage) 
	{
		//A try and catch to set up primary stage and catch any errors in the process
		try 
		{
			/*--Initializes variables to help set up the application--*/
			
			//Creates an instance of sound manager to manage sound effects for the application
			SoundManager sm = new SoundManager();
			
			//Creates an instance of user interface to set up the root pane and scene for the stage manager
			UserInterface ui = new UserInterface(sm);
			
			/*--Utilizes the UI class to set up our scene and to check for any user events--*/
			
			ui.setUpScene();
			ui.eventHandler();
			
			/*--Utilizes the updated scene and further settings for the stage manager--*/
			
			//Applies settings for our primary stage
			primaryStage.setTitle("Calculator");
			primaryStage.setResizable(false);
			
			//Sets up and showcases the updated scene to the primary stage 
			primaryStage.setScene(ui.getRootScene());
			primaryStage.show();
		} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/*A method to launch the JavaFX runtime, which eventually calls on the start() method above
	  	Note: This is the first method that runs when the user launches the application*/
	public static void main(String[] args) 
	{
		//This method is inherited from the extended class above (Application)
		launch(args); 
	}
}