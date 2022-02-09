import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject{

    @FindBy(id = "clientLogin")
    protected WebElement loginInput;

    @FindBy(id = "clientPass")
    protected WebElement passwordInput;

    @FindBy(id = "__submit_PK_M0118")
    protected WebElement submitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        loginInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }
}

