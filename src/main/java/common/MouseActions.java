package common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

   private final Actions actions;

    public MouseActions(Actions actions) {
        this.actions = actions;
    }

    public void scrollToElement(WebElement webElement) {
        actions.moveToElement(webElement).perform();
    }

    public void clickOnElement(WebElement webElement) {
        actions.moveToElement(webElement).click().perform();
    }
}
