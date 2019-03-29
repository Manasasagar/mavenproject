package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BasePage;

public class AdminPage extends BasePage {
    public AdminPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText="Admin")
    public WebElement admin;

    @FindBy(id="menu_admin_Organization")
    public WebElement orgnztn;

    @FindBy(xpath="//ul/li/a[contains(text(),'General Information')]")
    public WebElement gi;

    public void GeneralInfo(){
        if(gi!=null)
        {
            System.out.println("General Information Tab is present");
        }else{
            System.out.println("General Information Tab is not present");
        }
    }
    @FindBy(id="btnSaveGenInfo")
    public WebElement ed;
    @FindBy(id="organization_name")
    public WebElement orgN;
    @FindBy(id="organization_taxId")
    public WebElement txI;
    @FindBy(id="numOfEmployees")
    public WebElement noEms;
    @FindBy(id="organization_registraionNumber")
    public WebElement regNo;
    @FindBy(id="organization_phone")
    public WebElement phNo;
    @FindBy(id="organization_fax")
    public WebElement fx;
    @FindBy(id="organization_email")
    public WebElement eml;

}
