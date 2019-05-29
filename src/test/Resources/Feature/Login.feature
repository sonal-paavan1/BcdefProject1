@Login
Feature: User should not able to login with invalid credential
  So user should see error message

  Background:
    Given user is on Home page

  Scenario Outline: User should notable login with invalid credential

    When  user navigate to login Page
    And user enter invalid "<username>" and "<password>"
    Then user should not be logged in Successfully
    And user see "<Error Message>"

    Examples:

      | username                  | password      | Error Message                                                                                           |
      | goldydev2008@yahoo.com    | sonal12       | Login was unsuccessful. Please correct the errors and try again. The credentials provided are incorrect |
      | goldydev2008@yahoo.com    |               | Login was unsuccessful. Please correct the errors and try again. The credentials provided are incorrect |
      | goldydev2008@yahoo.com3   | sonalben123   | Login was unsuccessful. Please correct the errors and try again. No customer account found              |
      | goldydev2008@yahoo.com3   | sonal12       | Login was unsuccessful. Please correct the errors and try again. No customer account found              |
      | goldydev2008@yahoo.com3   |               | Login was unsuccessful. Please correct the errors and try again. No customer account found              |
      |                           | sonalben123   | Please enter your email                                                                                 |
      |                           | sonal12       | Please enter your email                                                                                      |
      |                           |               | Please enter your email                                                                                 |
