package computers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import genericLibrary.JavaScriptUtil;
import pomRepository.AddToCartPage;
import pomRepository.ComputersPage;
import pomRepository.DesktopsPage;
import pomRepository.HomePage;
/***
 * 
 * @author Satyajeet
 *
 */
public class TC_021Test extends Base_Class{
   public ExcelUtil excelUtil;
	
	@Test
	public void AddingDesktopItemTocart(){
		
		Reporter.log("Login Page is displayed",true);
		homePage.getComputersModuleLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers", "Computers page is not displayed");
		Reporter.log("Computers page is displayed",true);
		
	
		ComputersPage ComputersPage = new ComputersPage(driver);
		ComputersPage.clickOnDesktop();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Desktops", "Desktops page is not displayed");
		Reporter.log("Desktops page is displayed",true);
		
		DesktopsPage desktopPage = new DesktopsPage(driver);
		desktopPage.getselectElement().click();
		
		
		
		AddToCartPage addToCart = new AddToCartPage(driver);
		addToCart.getAddToCart().click();
		
		
		String cartText = addToCart.getAddCartText().getText();
		Assert.assertEquals(cartText,"The product has been added to your shopping cart", "Product is not added to cart");
		Reporter.log("Product is added to cart",true);
		addToCart.getCloseAd().click();
		Reporter.log("Logout Successfull",true);
		
		
		
		
		
		
		
		
		
	}

}
