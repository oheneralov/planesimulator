package plane;

import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;

/**
 * Represents the plane fuselage
 * 
 * @author oheneralov
 *
 */
public class Fuselage {
	public int radius;
	public int height;
	Cylinder fuselage;

	/**
	 * @param height
	 *            fuselage height
	 * @param radius
	 *            fuselage radius
	 */
	public Fuselage(int height, int radius) {
		super();
		this.height = height;
		this.radius = radius;
		fuselage = new Cylinder();
		fuselage.setHeight(height);
		fuselage.setRadius(radius);

		PhongMaterial material = new PhongMaterial();
		material.setDiffuseColor(Color.ALICEBLUE);
		fuselage.setMaterial(material);

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Cylinder toShape() {
		return this.fuselage;
	}

}
