package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
	
public WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	

	@FindBy(id="add-to-cart-button-72") private WebElement addToCart;
	
	@FindBy(xpath = "//p[text()='The product has been added to your ']") private WebElement addCartText;
	
	@FindBy(xpath="//span[@title='Close']") private WebElement closeAd;
	
	//@FindBy(id="add-to-cart-button-63") private WebElement addToCartAccessories;
	
	public WebElement getCloseAd() {
		return closeAd;
	}

	public WebElement getAddCartText() {
		return addCartText;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	

}
