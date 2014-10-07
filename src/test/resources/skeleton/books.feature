@books
Feature:Books_CRUD

  Scenario: Implement the CRUD functionalities of a book
    Given user lands on the home page

    When user clicks link 'books' to start the process
    Then user is on 'Books' page

    And user clicks the 'Add Book' link
    Then user is on 'NewBook' page

    And user enters '小王子' in field 'Title'
    And user enters 'http://img5.douban.com/lpic/s1237549.jpg' in field 'ImagePath'
    And user enters '[法] 圣埃克苏佩里' in field 'Author'
    And user enters '9787020042494' in field 'ISBN'
    And user clicks the 'Create' button
    Then user is on 'Books' page

    And user clicks the 'Last Edit' action
    Then user is on 'EditBook' page
    
    And user enters '小王子Upadated~' in field 'Title'
    And user enters 'Tingpeng' in field 'Author'
    When user clicks the 'Update' button
    Then user is on 'Books' page

    And user clicks the 'Last Delete' action
    Then user is on 'Books' page

