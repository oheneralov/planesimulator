package plane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;

/**
 * Represents a plane simulator
 * @version 1.0
 * @author Oleksandr Generalov
 *
 */
public class PlaneSimulator extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group plane = new Group();
		Wing wing1 = new Wing();
		Motor motor = new Motor(10, 2, 10, 100, 5);
		
		Fuselage fuselage1 = new Fuselage(100, 6);
		Ground ground = new Ground(700, 1100);
		plane.getChildren().add(ground.toShape());
		plane.getChildren().add(wing1.toShape());
		plane.getChildren().add(fuselage1.toShape());
		plane.getChildren().add(motor.toShape());
		
		
	    VBox generalPanel = new VBox();
	    Text header = new Text("Plane Simulator");
	    header.setFont(javafx.scene.text.Font.font("System", FontWeight.BLACK, 16));
	    
	    generalPanel.setSpacing(5);
	    generalPanel.setPadding(new Insets(1, 5, 5, 5));
	    generalPanel.getChildren().add(header);
	    
        ///rotate plane a bit
	    plane.setRotationAxis(Rotate.X_AXIS);
		plane.setRotate(plane.getRotate() + 40);
	    CommandPanel commandPanel = new CommandPanel(plane);
	    generalPanel.getChildren().add(commandPanel.getCommandPanel());
	    generalPanel.getChildren().add(plane); 
	    
		Scene scene = new Scene(generalPanel, 1200, 1000);
		scene.setFill(Color.rgb(230, 242, 255));
		primaryStage.setScene(scene);
		primaryStage.show();

	}
 


}
