Feature: Get Weather Details

  Scenario Outline: To Get Auckland Hourly Weather
    Given I am on Weather App and selected "<city>"
    Then the weather details are displayed and status code is 200;

    Examples:
      | city     |
      | Auckland |

  Scenario Outline: To Get Auckland Daily Weather without mandatory variable
    Given I am on Weather App and selected "<city>" with daily parameter and no Time zone.
    Then the weather details are displayed and status code is 400;
    And Time Zone mandatory error message is displayed

    Examples:
      | city     |
      | Auckland |


