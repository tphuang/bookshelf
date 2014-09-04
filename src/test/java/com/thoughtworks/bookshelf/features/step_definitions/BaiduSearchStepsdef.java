package com.thoughtworks.bookshelf.features.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BaiduSearchStepsdef {
//    private WebDriver browser = new FireFoxDriver();

    @Given("^I am on baidu home page$")
    public void I_am_on_the_home_page() {
//        browser.get(tomcat.getApplicationUrl("munger"));
        System.out.println("Baidu");
    }

    @When("^I enter the \"([^\"]*)\"$")
    public void I_enter_(String text) {
//        browser.findElement(By.id("text")).sendKeys(text);
        System.out.println("HelloWorld");
    }

    @Then("^I should be able to see the search result of \"([^\"]*)\"$")
    public void I_see_as_munged_text(String text) {
//        assertEquals(text, browser.findElement(By.id("munged")).getText());
        System.out.println("no result");
    }

    // More steps
}
