package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pom.AdminPage;
import pom.LoginPage;
import utility.BaseTest;
import utility.Excel;

public class TS_PIM_03 extends BaseTest {
    @Test(priority=2)
    public void TS_PIM_01() throws InterruptedException{
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
        AdminPage AP = new AdminPage(driver);
        AP.admin.click();
        Actions ac = new Actions(driver);
        WebElement wb = driver.findElement(By.id("menu_admin_Organization"));
        Thread.sleep(2000);
        ac.moveToElement(wb).build().perform();
        Thread.sleep(2000);
        AP.gi.click();
        Thread.sleep(2000);
        AP.ed.click();
        Thread.sleep(2000);
        AP.orgN.click();
        Thread.sleep(2000);
        AP.orgN.clear();
        Thread.sleep(2000);
        String expContent="TextModified";
        AP.orgN.sendKeys(expContent);
        Thread.sleep(2000);
        String actualContent=AP.orgN.getAttribute("value");
        if(expContent.equals(actualContent))
        {
            System.out.println("Textfield is editable");
        }
        else
        {
            System.out.println("Textfield is not editable");
        }

        AP.txI.click();
        Thread.sleep(2000);
        AP.txI.clear();
        String expContent_txI="TextModified";
        AP.txI.sendKeys(expContent_txI);
        Thread.sleep(2000);
        String actualContent_txI=AP.txI.getAttribute("value");
        if(expContent_txI.equals(actualContent_txI))
        {
            System.out.println("Textfield is editable");
        }
        else
        {
            System.out.println("Textfield is not editable");
        }

        AP.noEms.click();
        Thread.sleep(2000);
        //AP.noEms.clear();
        Thread.sleep(2000);
        String expContent_noEms="TextModified";
        AP.noEms.sendKeys(expContent_noEms);
        Thread.sleep(2000);
        String actualContent_noEms=AP.noEms.getAttribute("value");
        if(expContent_noEms.equals(actualContent_noEms))
        {
            System.out.println("Textfield is editable");
        }
        else
        {
            System.out.println("Textfield is not editable");
        }

        AP.regNo.click();
        Thread.sleep(2000);
        AP.regNo.clear();
        String expContent_regNo="TextModified";
        AP.regNo.sendKeys(expContent_regNo);
        Thread.sleep(2000);
        String actualContent_regNo=AP.regNo.getAttribute("value");
        if(expContent_regNo.equals(actualContent_regNo))
        {
            System.out.println("Textfield is editable");
        }
        else
        {
            System.out.println("Textfield is not editable");
        }

        AP.phNo.click();
        Thread.sleep(2000);
        AP.phNo.clear();
        String expContent_phNo="1234567890";
        AP.phNo.sendKeys(expContent_phNo);
        Thread.sleep(2000);
        String actualContent_phNo=AP.phNo.getAttribute("value");
        if(expContent_phNo.equals(actualContent_phNo))
        {
            System.out.println("Textfield is editable");
        }
        else
        {
            System.out.println("Textfield is not editable");
        }

        AP.fx.click();
        Thread.sleep(2000);
        AP.fx.clear();
        String expContent_fx="1234567890";
        AP.fx.sendKeys(expContent_fx);
        Thread.sleep(2000);
        String actualContent_fx=AP.fx.getAttribute("value");
        if(expContent_fx.equals(actualContent_fx))
        {
            System.out.println("Textfield is editable");
        }
        else
        {
            System.out.println("Textfield is not editable");
        }

        AP.eml.click();
        Thread.sleep(2000);
        AP.eml.clear();
        String expContent_eml="Text@gmail.com";
        AP.eml.sendKeys(expContent_eml);
        Thread.sleep(2000);
        String actualContent_eml=AP.eml.getAttribute("value");
        if(expContent_eml.equals(actualContent_eml))
        {
            System.out.println("Textfield is editable");
        }
        else
        {
            System.out.println("Textfield is not editable");
        }
        Thread.sleep(2000);
        AP.ed.click();
    }
}
