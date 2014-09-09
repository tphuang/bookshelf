package skeleton;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaiduSearchSteps {
    protected WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = new FirefoxDriver();
//        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webDriver.manage().window();
    }

    @After
    public void tearDown() {
        webDriver.close();
    }

    @Given("^I am on baidu home page$")
    public void I_am_on_the_home_page() {
        webDriver.get("https://www.baidu.com");
    }

    @When("^I enter the \"([^\"]*)\"$")
    public void I_enter_(String text) {
        webDriver.findElement(By.id("kw")).sendKeys(text);
    }

    @And("^Click on search button$")
    public void user_click_on_search_button() {
        webDriver.findElement(By.id("su")).click();
    }

    @Then("^I should be able to see the search result of \"([^\"]*)\"$")
    public void I_see_as_munged_text(String text) {
//        assertEquals(text, browser.findElement(By.id("munged")).getText());
    }
}
