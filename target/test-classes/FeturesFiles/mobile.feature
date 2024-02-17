
@P1
Feature: Facebook page login function
@Smoke
  Scenario: To validate Fb page login function with invalid credentials 
    Given User launch the browser
    Given User enters the url
    When User enters the username and password
    |sus|Masesumaha|
    |dfgh|dfghjoiuhg|
    When User clicks the Login button
    Then User navigates login failure page
  


Scenario Outline: To validate FB page login function with invalid credentials
    Given User launch the browser
    Given User enters the url	
    When User enters the "<username>" and "<password>"
    When User Clicks the login button
    Then User navigates to login failure page
    Examples:
    |username|password| 
    |selenium|67890-|
    |Welcome|234568|
    |Java|123|
    
    #
    #Scenario: To validate FB page login function with invalid credentials
    #Given User launch the browser
    #And User enters the url	
    #When User enters the username and password
    #When User Clicks the login button
    #Then User navigates to login failure page
 #
