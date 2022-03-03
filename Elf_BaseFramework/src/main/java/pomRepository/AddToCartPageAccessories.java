package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPageAccessories {
	
public WebDriver driver;
	
	public AddToCartPageAccessories(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(id="add-to-cart-button-63") private WebElement addToCartAccessories;

	public WebElement getAddToCartAccessories() {
		return addToCartAccessories;
	}
	
	
	

}



