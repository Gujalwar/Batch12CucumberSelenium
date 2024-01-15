package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DashboardStepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();

    @Then("The user navigates {string} menu")
    public void the_user_navigates_menu(String menuName) {

        dashboardPage.navigateMenu(menuName);

    }
    @Then("The user should be able to see header as {string}")
    public void the_user_should_be_able_to_see_header_as(String expectedHeader) {

        String actualHeader = dashboardPage.getHeader(expectedHeader);
        Assert.assertEquals(expectedHeader,actualHeader);

    }
    @Then("The user should be able to see following menu options")
    public void the_user_should_be_able_to_see_following_menu_options(List<String> expectedList) {

        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);

        //1 way
        List<String> actualList = new ArrayList<>();
        for (WebElement list : dashboardPage.menuList) {
            actualList.add(list.getText());
        }
        System.out.println("actualList = " + actualList);

        //2 way

        List<String> actualList2 = BrowserUtils.getElementsText(dashboardPage.menuList);
        System.out.println("actualList2 = " + actualList2);
        Assert.assertEquals(expectedList,actualList);


    }
    @When("The user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String,String> userCredentials) {

        System.out.println("userCredentials = " + userCredentials);
        String username= userCredentials.get("username");
        String password = userCredentials.get("password");

        loginPage.login(username,password);

        String expectedMessage = userCredentials.get("message");
        Assert.assertTrue(dashboardPage.welcomeMessage.getText().contains(expectedMessage));

    }

    @When("The user logs {string} and {string} and message contains {string}")
    public void theUserLogsAndAndMessageContains(String username, String password, String message) {
        System.out.println("username "+ username);
        System.out.println("password = " + password);
        System.out.println("message = " + message);
    }
}