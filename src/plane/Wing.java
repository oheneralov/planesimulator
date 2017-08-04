package plane;
import javafx.scene.Group;
import javafx.scene.shape.Box;
import javafx.scene.paint.*;

public class Wing implements Wings  {
	
	Box wing1;

	@Override
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
	
	public Box toShape() {
		return this.wing1;
	}


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
