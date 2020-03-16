package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RailsPage;
import util.Browser;

import java.util.ArrayList;

public class StepDefs {


    @Given("I am on rails page")
    public void i_am_on_rails_page() {
        RailsPage railsPage = new RailsPage();
        Assert.assertTrue(railsPage.verifyPage());
    }


    @When("I search for {string} repository")
    public void i_search_for_repository(String repoName) throws Exception{
        RailsPage railsPage = new RailsPage();
        railsPage.searchRepository(repoName);
    }

    @Then("I should see {string} in the search results")
    public void i_should_see_in_the_search_results(String string) {
        RailsPage railsPage = new RailsPage();
        ArrayList<String> repositoryNames = railsPage.getRepositoryNames();
        Assert.assertTrue(repositoryNames.get(0).contains(string));
    }

    @When("click on {string} repository")
    public void click_on_repository(String repoName) {
        RailsPage railsPage = new RailsPage();
        railsPage.clickRepositoryName(repoName);
    }

    @Then("I should see {string} repository page is displayed")
    public void i_should_see_repository_page_is_displayed(String string) {
        Browser.getTitle().contains(string);
    }

}
