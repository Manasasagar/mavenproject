package testdata;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pom.DashboardPage;
import pom.LoginPage;
import utility.BaseTest;
import utility.Excel;

public class TS_PIM_06 extends BaseTest {
    @Test(priority=2)
    public void TS_PIM_06() throws InterruptedException{
    String un = Excel.getCellValue(XLPATH, "Login", 1,0);
    String pw = Excel.getCellValue(XLPATH, "Login", 1,1);
    //System.out.println(un);
    LoginPage l = new LoginPage(driver);
		Thread.sleep(2000);
		l.username.sendKeys(un);
    	Thread.sleep(2000);
		l.password.sendKeys(pw);
		Thread.sleep(2000);
		l.login.click();
    	Thread.sleep(2000);
    DashboardPage DP = new DashboardPage(driver);
        DP.dshbrd.click();
        Thread.sleep(2000);
        DP.empDSG.click();
        Actions action= new Actions(driver);
        Thread.sleep(3000);
        action.moveToElement(DP.empDSG).build().perform();
        String eds=DP.empDSmsg.getText();
        System.out.println(eds + " Employee Distribution by Subunit");
}}
