package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BasePage;

public class DashboardPage extends BasePage {
    public DashboardPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(linkText="Dashboard")
    private WebElement Dashboard;

    public void Dashboard(){
        if(Dashboard!=null)
        {
            System.out.println("Successfully logged into Orange HRM system");
        }else{
            System.out.println("User is unable to login to Orange HRM system");
        }
    }

    @FindBy(xpath="//canvas[@class='flot-overlay']")
    public WebElement empDSG;

    @FindBy(id="hover_div_graph_display_emp_distribution")
    public WebElement empDSmsg;

    @FindBy(linkText="Dashboard")
    public WebElement dshbrd;
}
