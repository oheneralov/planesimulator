package plane;

import javafx.scene.shape.Box;
import javafx.scene.paint.*;

/**
 * @author Oleksandr Generalov
 * @version 1.0
 * This class represents the plane wings
 * 
 */

public class Wing implements Wings {

	Box wing1;

	@Override
	/**
	 * Sets wing width
	 * 
	 */
	public void setWidth() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCrossSectionWidth() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setCrossSectionHeight() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getWidth() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCrossSectionWidth() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getCrossSectionHeight() {
		// TODO Auto-generated method stub

	}

	/**
	 * @return returns Wing instance
	 * 
	 */

	public Box toShape() {
		return this.wing1;
	}

	/**
	 * Creates the new instance of Wing class
	 * 
	 */
	Wing() {
		wing1 = new Box();
		wing1.setHeight(100);
		wing1.setWidth(200);
		wing1.setDepth(150);
		PhongMaterial material = new PhongMaterial();
		material.setDiffuseColor(Color.BLUE);
		wing1.setMaterial(material);

	}

}
