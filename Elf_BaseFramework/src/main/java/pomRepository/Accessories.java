package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accessories {
	
public WebDriver driver;
	
	public Accessories(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	@FindBy(xpath="//img[@alt=\"Picture of TCP Coaching day\"]") private WebElement selectElement;
	
	
	public WebElement getselectElement() {
		return selectElement;
	}
	
	

}
