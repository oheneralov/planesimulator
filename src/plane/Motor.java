/**
 * 
 */
package plane;

import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.scene.Group;
import javafx.scene.paint.*;

/**
 * Represents the engines of the plane
 * 
 * @author oheneralov
 *
 */
public class Motor {
	Group engine;

	/**
	 * @param radius
	 *            radius of the propeller
	 * @param number
	 *            number of motors
	 * @param height
	 *            height of the motor supporter
	 * @param width
	 *            width of the motor supporter
	 * @param depth
	 *            depth of the motor supporter
	 */
	public Motor(int radius, int number, int height, int width, int depth) {
		Box supporter = new Box();
		supporter.setHeight(height);
		supporter.setWidth(width);
		supporter.setDepth(depth);
		supporter.setLayoutY(50);
		PhongMaterial material = new PhongMaterial();
		material.setDiffuseColor(Color.BLUE);
		supporter.setMaterial(material);
		Box propeller = new Box();
		propeller.setHeight(50);
		propeller.setWidth(3);
		propeller.setDepth(3);
		PhongMaterial materialPropeller = new PhongMaterial();
		materialPropeller.setDiffuseColor(Color.BLACK);
		propeller.setMaterial(materialPropeller);
		propeller.setLayoutY(propeller.getLayoutY() + 50);
		this.engine = new Group();
		engine.getChildren().addAll(propeller, supporter);
		engine.setRotationAxis(Rotate.X_AXIS);
		engine.setRotate(90);

	}

	public Group toShape() {
		return this.engine;
	}

}
