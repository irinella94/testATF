package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ParabankLogin extends PageObjects {
@FindBy(xpath ="//h1[normalize-space()='Error!']" )
    WebElement errorMessage;

    public ParabankLogin(WebDriver driver) {
        super(driver);
    }
}
