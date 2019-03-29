package testdata;

import org.testng.annotations.Test;
import pom.LoginPage;
import pom.PIMPage;
import utility.BaseTest;
import utility.Excel;

public class TS_PIM_04 extends BaseTest {
    @Test(priority=4)
    public void TS_PIM_04() throws InterruptedException{
        String un = Excel.getCellValue(XLPATH, "Login", 1,0);
        String pw = Excel.getCellValue(XLPATH, "Login", 1,1);
        LoginPage l = new LoginPage(driver);
//		Thread.sleep(5000);
        l.username.sendKeys(un);
//		Thread.sleep(5000);
        l.password.sendKeys(pw);
        Thread.sleep(2000);
        l.login.click();
        Thread.sleep(2000);
        PIMPage pp = new PIMPage(driver);
        pp.pim.click();
        Thread.sleep(2000);
        pp.add.click();
        Thread.sleep(2000);
        pp.FN.sendKeys("TestM77");
        Thread.sleep(2000);
        pp.lN.sendKeys("77TestM");
        Thread.sleep(2000);
        pp.EmpID.clear();
        pp.EmpID.sendKeys("775577");
        Thread.sleep(2000);
        pp.save.click();
        Thread.sleep(2000);
}}
