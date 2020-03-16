Feature: Verifying rails search repository page

  Scenario: Verify search repository
    Given  I am on rails page
    When I search for "webpacker" repository
    Then I should see "webpacker" in the search results


  Scenario: Verify repository link navigation
    Given  I am on rails page
    When click on "webpacker" repository
    Then I should see "webpacker" repository page is displayed