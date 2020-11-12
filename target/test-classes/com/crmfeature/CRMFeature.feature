#Author: your.email@your.domain.com

@tag
Feature: CRM Launching Feature
  I want to use this template for my feature file

  @crmscenarioOutline
  Scenario Outline: Login Logout Feature Outline
    Given I want to Login username as "<username>" and password as "<password>"
    When I complete action
    Then I want to Logout
    
    Examples:
     | username 								| password |
    	|snarayanan.c@outlook.com | Sachin18|
    
    
     @crmscenario
  Scenario: Login Logout Feature
    Given I want to Login
    When I complete action
    Then I want to Logout
    
    @crmscenarioTest
  Scenario: Login Logout Feature Test
    Given I want to Login
    When I complete action
    Then I want to Logout

