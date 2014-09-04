Feature:baidu_search

#  Scenario: search for keyword
#    Given I am on baidu home page
#    When When I search for 'HelloWorld'
#    Then I should be able to view the search result of 'HelloWorld'

  Scenario: It should process a sentence
    Given I am on baidu home page
    When I enter the "Hello World"
    And I press "Search"
    Then I should be able to see the search result of "Hello Wrold"