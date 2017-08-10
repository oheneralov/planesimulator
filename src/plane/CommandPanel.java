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
	 * @param commandPanel the command panel to manipulate the plane flight
	 */
	public void setCommandPanel(GridPane commandPanel) {
		this.commandPanel = commandPanel;
	}
	/**
	 * 
	 * @param plane is the plane
	 */
	CommandPanel(Group plane){
		Button leftButton = new Button("left");
		leftButton.setMinWidth(100);
		Button upButton = new Button("up");
		upButton.setMinWidth(100);
		Button rightButton = new Button("right");
		rightButton.setMinWidth(100);
		Button downButton = new Button("down");
		downButton.setMinWidth(100);
		// leftButton.setLayoutX(500);
		//leftButton.setLayoutY(400);
	    commandPanel = new GridPane();
	    commandPanel.add(leftButton, 0, 1);
	    commandPanel.add(upButton, 1, 0);
	    commandPanel.add(downButton, 1, 2);
	    commandPanel.add(rightButton, 2, 1);
	    
	    EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent e) {
				plane.setRotationAxis(Rotate.Y_AXIS);
				plane.setRotate(plane.getRotate() + 10);
				

			}
		};
		// Registering the event filter
		leftButton.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		rightButton.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		upButton.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		downButton.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
		
	}
	
	
	

}
