package javaFXNotes.colors;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


/**
 * Demonstrates different ways to create Color objects.
 * 
 * Colors typically take r, g, b (Red, Green, Blue) values represented by
 * floating-point values from 0.0 to 1.0, or integer values from 0 to 255.
 * Colors can also be indicated by a built-in constant or by using the
 * hexadecimal representation of the color.
 * 
 * Additionally you might want to specify the Alpha channel value which indicates
 * the transparency of the color.
 */
public class ColorDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Circle circle1 = new Circle(150, 150, 100);
		Circle circle2 = new Circle(550, 150, 100);
		Circle circle3 = new Circle(150, 550, 100);
		Circle circle4 = new Circle(550, 550, 100);
	
		Circle circle5 = new Circle(250, 150, 50);
		
		Pane pane = new Pane();

		pane.getChildren().addAll(circle5, circle1, circle2, circle3, circle4);

		//Create a Color object using the Color() constructor.
		//Not the preferred way to create colors.
		Color constructorColor1 = new Color(0.5, 0.14, 0.333, 0.75);
		Color constructorColor2 = new Color(0.4, 0.5, 0.654, 1.0);
		circle1.setFill(constructorColor1);
		circle5.setFill(constructorColor2);
		
		//Create a Color object using the static Color.rgb() method. 
		Color rgbColor = Color.rgb(28, 230, 44, 1.0);
		circle2.setFill(rgbColor);
		
		//Create color using the static Color.web() method.
		Color hexColor = Color.web("#f0be0a", 1.0);
		circle3.setFill(hexColor);
		
		//Create color using a built-in Color.CONSTANT_NAME constant.
		Color constColor = Color.AQUA;
		circle4.setFill(constColor);
	
		//Finish setting up the Scene and Stage.
		Scene scene = new Scene(pane, 700, 700);
		primaryStage.setTitle("ShowCircle"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
