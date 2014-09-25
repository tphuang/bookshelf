package skeleton;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class BaiduSearchSteps {
    protected WebDriver webDriver;

    @Before
    public void setUp() {
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriver.manage().window().setSize(new Dimension(860, 1080));
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
//    @When("^I enter the (.*)$")
    public void I_enter_(String text) {
        webDriver.findElement(By.id("kw")).sendKeys(text);
    }

    @And("^Click on search button$")
    public void user_click_on_search_button() throws InterruptedException {
        webDriver.findElement(By.id("su")).click();
        Thread.sleep(3000);
    }

    @Then("The search result title should contains \"([^\"]*)\"")
    public void the_search_result_title_should_contains(String text)
    {
//        WebElement message = webDriver.findElement(By.xpath("//*[@id='content_left']/li[1]/div/h3/a"));
        assertThat(webDriver.getTitle(), containsString(text));
    }
}
