@Flutter
Feature: Flutter

  @LaunchingFlutter
  Scenario: Launching Flutter
    Given User go to the Shrine Gallery
    When User add items to the cart and clear the cart
    And User clear the cart
    Then Cart should be empty