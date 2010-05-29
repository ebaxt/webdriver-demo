package webdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchResult {
    private final WebDriver wd;

    public GoogleSearchResult(WebDriver wd) {
        this.wd = wd;
    }

    public String getLinkToResultNumber(int i) {
        String xpathExpression = String.format("//*[@id='ires']/ol/li[%d]/h3/a", i);
        WebElement element = wd.findElement(By.xpath(xpathExpression));
        return element.getAttribute("href");
    }
}
