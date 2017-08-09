package plane;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * @version 1.0
 * @author Oleksandr Generalov
 * <p>
 * Represents a plane simulator
 * </p>
 *
 */
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
		//leftButton.setLayoutY(400);
		plane.getChildren().add(wing1.toShape());
	    VBox generalPane = new VBox();
	    Text header = new Text("Plane Simmulator");
	    header.setFont(javafx.scene.text.Font.font("System", FontWeight.BLACK, 16));
	    generalPane.getChildren().add(header);
	    generalPane.getChildren().add(plane);
	    generalPane.getChildren().add(leftButton);
		Scene scene = new Scene(generalPane, 600, 500);
		
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
