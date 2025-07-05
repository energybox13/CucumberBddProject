Feature: Login functionality
@regression
Scenario: Login with valid credentials
  Given User launch chrome browser
  When User open url "https://admin-demo.nopcommerce.com"
  And User has entered valid email address "admin@yourstore.com"
  And User has entered valid password "admin"
  And User clicks on login button
  #Then Page title should be "Swag labs"
  #Then close browser

Scenario Outline: Successful login with Valid DDT
  Given User launch chrome browser
  When User open url "https://admin-demo.nopcommerce.com"
  And User has entered valid email address "<username>"
  And User has entered valid password "<password>"
  And User clicks on login button
  Then Page title should be "<title>"
  Then close browser
 
Examples:
  | username| password| title|
  | admin@yourstore.com|admin|Swag labs|