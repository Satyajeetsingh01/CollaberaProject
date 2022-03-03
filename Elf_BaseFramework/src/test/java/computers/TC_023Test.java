package computers;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.Accessories;
import pomRepository.AddToCartPageAccessories;
import pomRepository.ComputersPage;

public class TC_023Test extends Base_Class{
	
	@Test
	public void AddingAccessoriesItemTocart(){
	
	homePage.getComputersModuleLink().click();
	
	ComputersPage ComputersPage = new ComputersPage(driver);
	ComputersPage.getAccessories().click();
	
	Accessories accessories = new Accessories(driver);
	accessories.getselectElement().click();
	
	AddToCartPageAccessories acpa = new AddToCartPageAccessories(driver);
	acpa.getAddToCartAccessories().click();
	}
	
}
