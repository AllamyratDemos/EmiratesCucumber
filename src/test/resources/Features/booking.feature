@book
Feature: Booking a flight

  Background:
    Given user navigates to Emirates booking page


  Scenario: User should is on Emirates flight booking page
    Then the page title should be "Book a flight"

  Scenario: Emirates logo is displayed on the home page
    Then system should display the Emirates logo

  Scenario: Navigation to Emirates home page with Emirates logo
    When user clicks on Emirates logo
    Then system should navigate to Emirates home page
