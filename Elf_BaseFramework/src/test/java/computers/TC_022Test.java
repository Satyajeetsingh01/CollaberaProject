package computers;

import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import pomRepository.ComputersPage;
import pomRepository.NotebookPage;

public class TC_022Test extends Base_Class {
	
	@Test
	public void AddingNotebookItemTocart(){
		
	homePage.getComputersModuleLink().click();
	
	ComputersPage computersPage = new ComputersPage(driver);
	computersPage.getNotebooks().click();
	
	NotebookPage notePage = new NotebookPage(driver);
	notePage.getaddToCart().click();
	
	

}
}


