Feature:baidu_search

  Scenario: search Hello World with baidu
    Given I am on baidu home page
    When I enter the "Hello World"
    And Click on search button
    Then I should be able to see the search result of "Hello Wrold"