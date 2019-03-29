package testdata;

import org.testng.annotations.Test;

import pom.DashboardPage;
import utility.Excel;
import pom.LoginPage;
import utility.BaseTest;

public class TS_PIM_01 extends BaseTest {
	@Test(priority=1)
	public void TS_PIM_01() throws InterruptedException{
		String un = Excel.getCellValue(XLPATH, "Login", 1,0);
		String pw = Excel.getCellValue(XLPATH, "Login", 1,1);
		//System.out.println(un);
		 LoginPage l = new LoginPage(driver);
//		Thread.sleep(5000);
		l.username.sendKeys(un);
//		Thread.sleep(5000);
		l.password.sendKeys(pw);
		Thread.sleep(5000);
		l.login.click();
//		Thread.sleep(5000);
	DashboardPage DP = new DashboardPage(driver);
	    DP.Dashboard();
	}
}
