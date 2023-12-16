
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id="username")
	private WebElement unTbx;
	@FindBy(name="pwd")
	private WebElement pwdTbx;
	@FindBy(xpath= "")
	private WebElement loginBtn;
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pwd) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);
		loginBtn.click();
	}
	

}
