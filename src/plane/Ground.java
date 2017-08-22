package plane;
import javafx.scene.shape.Box;
import javafx.scene.paint.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException; 
/**
 * Simulates the ground
 * @author oheneralov
 *
 */
public class Ground {
	Box ground;
	Ground(int height, int width){
		ground = new Box();
		ground.setHeight(height);
		ground.setWidth(width);
		ground.setDepth(10);
		PhongMaterial groundMaterial = new PhongMaterial();
		
	
		groundMaterial.setDiffuseColor(Color.BLACK);
		ground.setMaterial(groundMaterial);
	}
	public Box toShape() {
		return ground;
	}

}
