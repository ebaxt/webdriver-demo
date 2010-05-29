package webdriverDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class GoogleSearchTest {
    private WebDriver wd;

    @Before
    public void setUp() {
        this.wd = new FirefoxDriver();
    }

    @Test
    public void shouldReturnMilesAsTopSearchResult() {
        GoogleFrontPage googleSearch = new GoogleFrontPage(wd);
        GoogleSearchResult searchResult = googleSearch.search("Miles AS");
        String linkToFirstResult = searchResult.getLinkToResultNumber(1);
        assertThat(linkToFirstResult, containsString("www.miles.no"));
    }

    @After
    public void tearDwon() {
        wd.close();
    }
}
