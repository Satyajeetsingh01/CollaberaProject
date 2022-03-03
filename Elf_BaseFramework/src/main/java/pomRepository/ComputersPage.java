package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ComputersPage {
	
	public WebDriver driver;
	
	public ComputersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(linkText="Desktops") private WebElement desktops;
	
	@FindBy(linkText="Notebooks") private WebElement notebooks;
	
	@FindBy(linkText="Accessories") private WebElement accessories;

	public WebElement getDesktops() {
		return desktops;
	}

	public WebElement getNotebooks() {
		return notebooks;
	}

	public WebElement getAccessories() {
		return accessories;
	}
	
	public void clickOnDesktop(){
		desktops.click();
		
		
	}
	
	
}
