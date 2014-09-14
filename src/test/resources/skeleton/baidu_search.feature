Feature:baidu_search

  Scenario: search Hello World with baidu
    Given I am on baidu home page
    When I enter the "Hello World"
    And Click on search button
    Then The search result title should contains "Hello World"