package com.thoughtworks.bookshelf.features.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GreetingStepdefs {
    @Given("^I have a greeting app with \"Hello\"$")
    public void I_have_a_greeting_app(){
        System.out.println("Greeting App");
    }

    @When("^I ask it to say hi$")
    public void I_ask_it_to_say_hi() {
        System.out.println("Hi");
    }

    @Then("^I receive \"Hello World\"$")
    public void I_receive_hello_world(){
        System.out.println("Hello World");
    }


}
