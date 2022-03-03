package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NotebookPage {
	
public WebDriver driver;
	
	public NotebookPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath="//input[@value='Add to cart']") private WebElement addToCart;
	
	
	
	public WebElement getaddToCart() {
		return addToCart;
	}
	
	
	
}

