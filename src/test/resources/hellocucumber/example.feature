Feature: An example and expressions

  Background: Background
    Given background step def

  @tag
  @conditionalhooks
  Scenario: The example
    Given an example scenario
    When all step definitions are implemented
    Then the scenario passes

  Scenario: Some cukes
    Given I have 48 cukes in my belly

  Scenario: Cucumber expressions
    Given I have 2 red mangoes in my belly

  Scenario: Weird Cucumber expressions
    Given I have 2 code editors installed in my machine
    When I use only 1 code editor
    Then I uninstall another "code editor" from my machine

