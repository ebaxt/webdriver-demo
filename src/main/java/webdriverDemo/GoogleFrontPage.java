package webdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleFrontPage {
    public static final String GOOGLE_FRONT_PAGE_URL = "http://www.google.com";
    private final WebDriver wd;

    public GoogleFrontPage(WebDriver wd) {
        this.wd = wd;
        wd.get(GOOGLE_FRONT_PAGE_URL);
    }


    public GoogleSearchResult search(String s) {
        WebElement searchBox = wd.findElement(By.name("q"));
        searchBox.sendKeys(s);
        searchBox.submit();
        return new GoogleSearchResult(wd);
    }
}
