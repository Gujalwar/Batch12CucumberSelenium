package com.eurotech.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenuStepDefinitions {
    @Then("The user should be able to see welcome message")
    public void the_user_should_be_able_to_see_welcome_message() {

        System.out.println("Welcome message is here");

    }
    @Then("The user navigates to Developers menu")
    public void the_user_navigates_to_developers_menu() {

        System.out.println("The user clicks developers menu");

    }
    @Then("The user able to see Developer text")
    public void the_user_able_to_see_developer_text() {

        System.out.println("Developer text is here");
    }
    @Then("The user navigates All Posts menu")
    public void the_user_navigates_all_posts_menu() {

        System.out.println("The user clicks All Posts menu");

    }
    @Then("The user able to see Posts text")
    public void the_user_able_to_see_posts_text() {

        System.out.println("All Posts text is here");

    }
    @Then("The user navigates My Account menu")
    public void the_user_navigates_my_account_menu() {
        System.out.println("The user clicks My Account menu");

    }
    @Then("The user able to see Dashboard text")
    public void the_user_able_to_see_dashboard_text() {
        System.out.println("Dashboard text is here");
    }

}

