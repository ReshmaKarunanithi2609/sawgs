Feature: Login functionality for Android Mobile App

  @Ignore
  Scenario: Verify user can successfully launch the app and login # src/test/resources/Feature/login.feature:3
  Given User launch the application on emulator
  When User enters username and password
   And User clicks on the login button
    When User clicks on ADD to cart
    And User clicks on the cart icon 
    
  @Ignore
  Scenario: Verify user can successfully launch the app and login # src/test/resources/Feature/login.feature:3
  Given User launch the application on emulator
  When User enters username and password
   And User clicks on the login button
   Then User clicks on the Filter icon
   Then User clicks on the hightolow icon
    And User clicks on the cart icon 
    Then the user should be validtate the price
    Then user Click the continue shopping
    
    @Ignore
  Scenario: Verify user can successfully launch the app and login # src/test/resources/Feature/login.feature:3
    Given User launch the application on emulator
  When User enters username and password
   And User clicks on the login button
   Then User clicks on the Filter icon
   Then User clicks on the hightolow icon
    And User clicks on the cart icon 
    Then the user should be validtate the price
    Then the User click the Checkout Information
    Then User Fill the form DETAILS
    And User click the cancelbutton
    
    
    @Ignore
  Scenario: Verify user can successfully launch the app and login # src/test/resources/Feature/login.feature:3
    Given User launch the application on emulator
  When User enters username and password
   And User clicks on the login button
   Then User clicks on the Filter icon
   Then User clicks on the hightolow icon
    And User clicks on the cart icon 
    Then the user should be validtate the price
    Then the User click the Checkout Information
    Then User Fill the form DETAILS
    And User click the cancelbutton
    Then user clicks on ALL ITEMS from the menu list
    
    
    
    @iGNOREy
  Scenario: Verify user can successfully launch the app and login # src/test/resources/Feature/login.feature:3
    Given User launch the application on emulator
  When User enters username and password
   And User clicks on the login button
   When User finds highest and lowest price
  
   
   @Ignore
   Scenario: Verify user can successfully launch the app and login # src/test/resources/Feature/login.feature:3
    Given User launch the application on emulator
  When User enters username and password
   And User clicks on the login button
   Then user scrolls and adds all products to cart
   

   @Sanity
   Scenario: Verify user Menubar # src/test/resources/Feature/login.feature:3
    Given User launch the application on emulator
  When User enters username and password
   And User clicks on the login button
   Then user clicks on ALL ITEMS from the menu bar
   And User click the Webview and give the url
   And User click the QRScanner
   And User click the GEOLOCATION 
   Then Uer click the Drawing and allow the image
   
    
    
    
