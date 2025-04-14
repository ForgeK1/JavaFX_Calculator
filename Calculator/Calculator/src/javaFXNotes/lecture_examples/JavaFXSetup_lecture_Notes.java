package javaFXNotes.lecture_examples;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFXSetup_lecture_Notes extends Application
{
	/*------------------INTRO TO JAVA FX------------------*/
	/*
	 
	 * HOW DO WE GET JAVAFX STARTED?
	 
	 1) For every JavaFX class, you will want to have a main method
	    and extend to the Application class
	    
	 2) Add the start the unimplemented method start() which will 
	 	contain the primaryStage in the parameter. A Stage is the window
	 	that will pop up
	 	
	 3) In your main method, make sure to include Application.launch(args)
	 	because the program does not know to start the start() method
	 	
	 4) For every JavaFX class, make sure to extend Application, include start()
	 	unimplemented method, and have a main method that runs the Application
	 	
	 * NOTES FOR THIS CLASS
	 
	 1) Everything is comprised of layers: You have a stage (window), and in the stage you 
	 									   have a scene (which you can swap out to a new 
	 									   scene on the same window) which you have pane 
	 									   (or a panel) that contain all the components that 
	 									   are on the panel.
	 	
	 	Summary: Have your class extend to Application, add start method, create a stage (window), create any  
	 			 amount of scenes (just one most of the time), create classes and assign properties to your  
	 			 components/objects, add your components to a panel, assign that panel to any scene, and assign  
	 			 your scene primaryStage (primary window), then finally run the application in main
	 									   
	    IMPORTANT: Because Keenan can't teach you everything, you will have to look at the 
	 			   JavaFX API to learn all of the methods you can use
	 			   
	 3) What are Nodes and how do they relate to its subclasses?: The JavaFx looks for a Node object
	    and it allows the GUI to connect all other components together (allows to categorize a set of
	    things for them all to interact to each other) --> You can put anything inside of a Node such
	    as Button Shape, image, control, and pane (Research more about Nodes)
	    
	    ***COMMON PROPERTIES FOR NODES***
	    
	    *	The Node class contains several methods that can customize any component (component = any object that is a subclass of Nodes)
	    		Ex) Button would be able to inherit all of the customizable methods from the Node class
	    
	    *	CSS: A coding cascating style sheet that takes the functionallity of html and makes
	    		 the product look pretty 
	    		 
	    * 	JavaFX CSS: Just like CSS, JavaFX CSS is a styling sheet that can style all the
	      				applications
	     
	    * 	How can you get it work?: You can use .setStyle and any style you want to add
	     		Ex) btOK.setStyle(-fx-border-);
	     		
	    * 	
	 			   
	 4) Panes, Groups, UI Controls, and Shapes are a subclass of Nodes. Therefore, you want to 
	 	build your JavaFX in layers: Nodes (Inner Layer) --> Pane, Group, Control (Middle layer), 
	 	and Shapes --> Scene (Outer Layer), Stage (Outside Layer)
	 	
	 	Note: Make sure to write notes on what each subclass' purpose is and what they do
	 	
	 5) You would want to create Backed classes (like the CustomButton class) and you should 
	 	never have Backed code to GUI code (Fronted code the user sees) in the same method 
	    (Get all the logic going, and then add your GUI to physically show your work)
	 	
	 	Ex) Everything you have been doing in this class is the Frontend code the user sees
	 	
	 	IMPORTANT: Don't do everything in the start() method!!! You can create separate method
	 			   or classes that will return you objects (like a blue circle)
	   
	 6) How do you utilize panes?: You would want to build all of your components, 
	    and then add any specific panes you need to add to utilize your components
	    (like VBox Vpane), then you want to add of your panes to a primary pane (like
	    a StackPane) which you will then assign to the Scene and then assign Scene to
	    the primary Stage
	    
	 7) GUIs do not utilize the Cartesian coordinate system, instead they have their (0,0)
	    coordinate in the upper most corner (For JavaFX is at the upper left [under the 
	    border]). 
	    	
	    	- Positive and Negative x and y are fliped (so positive x is down and negative is
	    	  up which goes the same for y)
	    	  
	   
	 */
	
	/*------------------IMPORTANT NOTES TO KNOW------------------*/
	/*
	 
	 //COLOR CLASS
	 1) All colors are represented by RGB (Red Green Blue), and the way
	 	it works is that you have pixels on your screen, each pixel being 
	 	light bulb, in which each pixel is made up of three colored (Red Green Blue)
	 	
	 	So, the intensity (0 (Off or Black) --> 255 (Brightest it can be)) shows what
	 	color you will see 
	 	
	 	Ex) (0, 0, 0) --> (255, 255, 255). A while background would have (255, 255, 255)
	 		
	 		(28, 214, 149) --> 28 for red, 214 for green, 149 for blue.
	 	
	 	As a result, to choose what color you want you can google "Color Picker" to give
	 	you the RGB values you need 
	 	
	 	How can we make colors in JavaFX?: You can create a color object using the static
	 	method built into the class using .rgb() method. And then you can use the methods
	 	from the Node object to assign the color (button.setFill(rgbValue))
	 	
	 	Note: You can also use COLOR CONSTANTS from the Color class available in the
	 		  JavaFX API (But its better to use the .rgb() method)	 
	 		  
	 //FONT CLASS
	 1) Look at the Book
	 
	 //Image Class
	 1) Unlike FileIO, JavaFX the file path is relative to the src folder instead of being
	 	relative the project you are working on. So, DON'T put the "src" in the relative
	 	path
	 	
	 2) Image is not a subclass of Node, so you need to cast it as an ImageView
	 		Ex) Image image = new Image(_RELATIVE PATH_);
	 			
	 			pane.getChildren.add(new ImageView(image);
	 
	 //LAYOUT PANES
	 1) Pane: A basic pane that will have absolute positions or positions of the objects
	 	
	 	Note: If you don't specify the coordinates then they will show 
	 		
	 2) Stack Pane: Stacks panes on top of each other
	 
	 3) Flow Pane: The components will flow left to right and down to up (Flow within the
	 			  available space
	 
	 4) Grid Pane: Holds and shows all components in a Grid base format
	 
	 	Ex) 2D array that holds everything in a Grid
	 	
	 	Note: Although it is like 2D array, the last two indexes are column and then row
	 		  not row and then column
	 		  
	 5) Border Pane: Contains regions you place components into. These regions include
	 				 Top Bottom, Left Right, and Center. So you specifically choose 
	 				 which component occupies what region.
	 
		Ex) You can You can create a custom class that extends Stackpane and create the
			visual borders and then utilize them as a Note to be used for a Border Pane 
			so that they can be fixed to the Top Bottom, Left Right, and Center borders
			
	 6) HBox and VBox: Horizontal and Vertical Box
	 */

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		/*IMPORTANT: For the first couple of examples, we do not include panes,
		 			 so we add components to the scene and then that scene gets
		 			 assigned to the primary stage*/
		
		/*For every control we want to have the first two letters let us know
		  what object we're dealing with (naming schemes or abbreviations)
		  
		  Note: Make sure to import Button from javafx.scene.control and not
		  		java.awt! Therefore, for every object you create you want to 
		  		make sure you want to import assets from javaFX.*/
		Parent btOk = new Button("OK");
		
		/*We can attach an anonymous button to the scene*/
		Scene scene = new Scene(btOk, 200, 200);
		
		/*Series of lines below will assign the scene to the primary page, then
		  have a title for it, and then finally show it*/
		primaryStage.setScene(scene);
		primaryStage.setTitle("My First JavaFX Program");
		primaryStage.show();
		
		/*You can also set up multiple stages*/
		Stage stage = new Stage();
		stage.setTitle("Second Stage");
		stage.setScene(new Scene(new Button("New Stage")));
		stage.show();
	}
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
}
