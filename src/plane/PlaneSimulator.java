package plane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.*;

public class PlaneSimulator extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Group plane = new Group();
		Wing wing1 = new Wing();
		Button leftButton = new Button("Rotate left");
		// leftButton.setLayoutX(500);
		leftButton.setLayoutY(400);
		
		plane.getChildren().add(leftButton);
		plane.getChildren().add(wing1.toShape());
		Scene scene = new Scene(plane, 600, 500);
		scene.setFill(Color.rgb(230, 242, 255));
		
		primaryStage.setScene(scene);
		
		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Hello World");
				plane.setRotationAxis(Rotate.Y_AXIS);
				plane.setRotate(plane.getRotate() + 10);
				

			}
		};
		// Registering the event filter
				leftButton.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		
		primaryStage.show();

	}

}
