package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BasePage;

public class PIMPage extends BasePage {

    public PIMPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pim;
    //ADD
    @FindBy(id="menu_pim_addEmployee")
    public WebElement add;
    //FN
    @FindBy(id="firstName")
    public WebElement FN;
    //LN
    @FindBy(id="lastName")
    public WebElement lN;

    @FindBy(id="employeeId")
    public WebElement EmpID;
    //upload button
    @FindBy(id="photofile")
    public WebElement photofile;
    //SAVE
    @FindBy(id="btnSave")
    public WebElement save;

    @FindBy(linkText="775577")
    public WebElement id;

    @FindBy(id="empPic")
    public WebElement EmpPic;

}
