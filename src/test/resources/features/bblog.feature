Feature: Crud articles bblog

  @Crudbblog
  Scenario: Crud articles bblog
    Given that costumer open up bblog page
    When He Create a new Article
    And  He Update an Article
    And  He Delete an Article
    And  He Read an Article
    Then logut