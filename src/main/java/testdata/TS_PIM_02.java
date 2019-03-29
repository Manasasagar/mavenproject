package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pom.AdminPage;
import pom.LoginPage;
import utility.BaseTest;
import utility.Excel;

public class TS_PIM_02 extends BaseTest {
    @Test(priority=2)
    public void TS_PIM_01() throws InterruptedException{
        String un = Excel.getCellValue(XLPATH, "Login", 1,0);
        String pw = Excel.getCellValue(XLPATH, "Login", 1,1);
        //System.out.println(un);
        LoginPage l = new LoginPage(driver);
//		Thread.sleep(5000);
        l.username.sendKeys(un);
//		Thread.sleep(5000);
        l.password.sendKeys(pw);
        Thread.sleep(2000);
        l.login.click();
        Thread.sleep(2000);
        AdminPage AP = new AdminPage(driver);
        AP.admin.click();
        Actions ac = new Actions(driver);
        WebElement wb = driver.findElement(By.id("menu_admin_Organization"));
        Thread.sleep(2000);
        ac.moveToElement(wb).build().perform();
        Thread.sleep(2000);
        AP.GeneralInfo();
    }
}
