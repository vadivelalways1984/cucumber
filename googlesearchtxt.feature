
@tag
Feature: verify the googlesearch



  @tag2
  Scenario Outline: verify the googlesearch cucumber and testng
    Given User search the googlepage
    When User the enter the "<name>"
    Then User validiate the searchname

    Examples: 
     |name|
      | TestNG |
      | Selenium |   
      | Cucumber | 