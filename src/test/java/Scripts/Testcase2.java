package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import generic_library.BaseClass;

public class Testcase2  extends BaseClass{
	@Test
	public void tc2() {
		SkillraryHomePage s = new SkillraryHomePage(driver);
		s.gearsButton();
		s.skillraryDemoApp();
	 utilities.childBrowser(driver);
	 DemoSkillraryPage ds = new DemoSkillraryPage(driver);
	 ds.feebackbtn();
	 DownloadInvoicePage dI=new DownloadInvoicePage(driver);
	 dI.downloadInvoiceButton();
	}

}
