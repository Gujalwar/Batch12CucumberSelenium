package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }
    @When("The user enters teacher credentials")
    public void the_user_enters_teacher_credentials() {

        loginPage.loginAsTeacher();

    }
    @Then("The user should be able to log in")
    public void the_user_should_be_able_to_log_in() {
        BrowserUtils.waitFor(1);
        Assert.assertEquals("http://eurotech.study/dashboard",Driver.get().getCurrentUrl());

    }
    @When("The user enters student credentials")
    public void the_user_enters_student_credentials() {

        System.out.println("I enter student username and password and click login button");
    }

    @When("The user enters developer credentials")
    public void the_user_enters_developer_credentials() {

        System.out.println("I enter developer username and password and click login button");
        Assert.assertEquals("One","Two");
    }

    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {

        System.out.println(username);
        System.out.println(password);

        loginPage.login(username, password);
        BrowserUtils.waitFor(2);
    }

    @Then("The welcome message contains {string}")
    public void theWelcomeMessageContains(String welcomeMessage) {

        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(welcomeMessage));
    }


    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedMessage) {

        String actualMessage = loginPage.getWarningMessage(expectedMessage);
        Assert.assertEquals(expectedMessage,actualMessage);

    }
}