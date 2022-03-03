package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage {
public WebDriver driver;
	
	public DesktopsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath="//img[@src='http://demowebshop.tricentis.com/content/images/thumbs/0000172_build-your-own-cheap-computer_125.jpeg']") private WebElement selectElement;
	
	
	
	public WebElement getselectElement() {
		return selectElement;
	}
	
	
	
}


