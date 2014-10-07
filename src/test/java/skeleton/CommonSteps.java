package skeleton;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import skeleton.pages.BeginPage;
import skeleton.pages.BooksPage;

public class CommonSteps {
    private WebDriver webDriver;
    private PageHelper pageHelper;

    @Before
    public void setUp() {
        webDriver = new FirefoxDriver();
        webDriver.manage().window().setSize(new Dimension(860, 1080));

        pageHelper = new PageHelper(webDriver)
                .initPage(new BeginPage())
                .initPage(new BooksPage());
    }

    @After
    public void tearDown() {
        webDriver.close();
    }

    @Given("^user lands on the home page$")
    public void user_on_the_home_page() {
        pageHelper.getAppUrl();
    }

    @When("^user clicks link '(.*)' to start the process$")
    public void user_clicks_nav_link(String link ) {
        pageHelper.getElementByElementId(link).click();
    }

    @Then("^user is on '(.*)' page$")
    public void user_on_special_page(String pageName) {
        pageHelper.assertOnPage(pageName);
    }

    @And("^user clicks the '(.*)' link$")
    public void user_clicks_link(String linkText){
        pageHelper.getElementByElementId(linkText).click();
    }

    @And("^user clicks the '(.*)' button$")
    public void user_clicks_button(String buttonName){
        pageHelper.getElementByCssSelector(buttonName).submit();
    }

    @And("^user clicks the '(.*)' action$")
    public void user_clicks_action(String actionName){
        pageHelper.getLastElementByCssSelector(actionName).click();
    }

    @And("^user enters '(.*)' in field '(.*)'$")
    public void user_enters_in_field(String content, String field){
        pageHelper.fillInput(content, field);
    }
}
