package plane;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.transform.Rotate;
import javafx.scene.Group;

/**
 * Generates the command panel to manipulate the plane flight
 * 
 */
public class CommandPanel {
	GridPane commandPanel;

	/**
	 * 
	 * @return GridPane node - a command panel
	 */
	public GridPane getCommandPanel() {
		return commandPanel;
	}

	/**
	 * 
	 * @param commandPanel
	 *            the command panel to manipulate the plane flight
	 */
	public void setCommandPanel(GridPane commandPanel) {
		this.commandPanel = commandPanel;
	}

	/**
	 * 
	 * @param plane
	 *            is the plane
	 */
	CommandPanel(Group plane) {
		Button leftButton = new Button("left");
		leftButton.setMinWidth(100);
		Button upButton = new Button("up");
		upButton.setMinWidth(100);
		Button rightButton = new Button("right");
		rightButton.setMinWidth(100);
		Button downButton = new Button("down");
		downButton.setMinWidth(100);
		Button start = new Button("Start");
		Button stop = new Button("Stop");
		// leftButton.setLayoutX(500);
		// leftButton.setLayoutY(400);
		commandPanel = new GridPane();
		commandPanel.add(leftButton, 0, 1);
		commandPanel.add(upButton, 1, 0);
		commandPanel.add(downButton, 1, 2);
		commandPanel.add(rightButton, 2, 1);
		commandPanel.add(start, 0, 4);
		commandPanel.add(stop, 1, 4);

		// Registering the event filter
		leftButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				plane.setRotationAxis(Rotate.Z_AXIS);
				plane.setRotate(plane.getRotate() - 10);

			}
		});

		// Registering the event filter
		rightButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				plane.setRotationAxis(Rotate.Z_AXIS);
				plane.setRotate(plane.getRotate() + 10);

			}
		});

		// Registering the event filter
		upButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				plane.setRotationAxis(Rotate.X_AXIS);
				plane.setRotate(plane.getRotate() + 10);

			}
		});

		downButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				plane.setRotationAxis(Rotate.X_AXIS);
				plane.setRotate(plane.getRotate() - 10);

			}
		});
		
		start.setOnMouseClicked(new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				plane.getChildren().get(2).setLayoutX(150);
				
			}
		});

	}

}
