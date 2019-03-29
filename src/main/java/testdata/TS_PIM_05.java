package testdata;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pom.LoginPage;
import pom.PIMPage;
import utility.BaseTest;
import utility.Excel;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class TS_PIM_05 extends BaseTest {
    @Test(priority=4)
    public void TS_PIM_05() throws InterruptedException{
    String un = Excel.getCellValue(XLPATH, "Login", 1,0);
    String pw = Excel.getCellValue(XLPATH, "Login", 1,1);
    LoginPage l = new LoginPage(driver);
		Thread.sleep(2000);
        l.username.sendKeys(un);
		Thread.sleep(2000);
        l.password.sendKeys(pw);
        Thread.sleep(2000);
        l.login.click();
        Thread.sleep(2000);
    PIMPage pp = new PIMPage(driver);
        pp.pim.click();
        Thread.sleep(2000);
        pp.id.click();
        Thread.sleep(3000);
        pp.EmpPic.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='head']/h1")).click();
        Thread.sleep(2000);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
//        Thread.sleep(2000);
//        pp.photofile.click();
//        Thread.sleep(3000);
//        Thread.sleep(5000);
        String arg_path="D:\\";
        String Path =  arg_path;
        String Measure_Path = Path + "download.jpg";
        StringSelection ss = new StringSelection(Measure_Path);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//
//
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);
//
        pp.save.click();
}
}
