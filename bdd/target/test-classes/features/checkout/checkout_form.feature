Feature: Checkout Form Test

  Scenario: Fill out the checkout form and submit via Credit Card
    Given User navigates to the checkout page
    When User enters first name "John"
    And User enters last name "Doe"
    And User enters user name "Lolyou"
    And User enters email "sfsf@gmail.com"
    And User enters address "Block 619 Ave 2"

    And User selects country "United States"
    And User selects state "California"
    And User enters zip code "90210"
    And User toggles the 'same address' checkbox
    And User toggles the 'save info' checkbox
    And User selects payment method "Credit Card"

    And User enters card name "John"
    And User enters credit number "411111111"
    And User enters expiration "02/45"
    And User enters cvv "321"
    And User clicks the Submit button
    Then User should see no errors
    
  Scenario: Fill out the checkout form and submit via Debit Card
    Given User navigates to the checkout page
    When User enters first name "John"
    And User enters last name "Doe"
    And User enters user name "Lolyou"
    And User enters email "sfsf@gmail.com"
    And User enters address "Block 619 Ave 2"

    And User selects country "United States"
    And User selects state "California"
    And User enters zip code "90210"
    And User toggles the 'same address' checkbox
    And User toggles the 'save info' checkbox
    And User selects payment method "Debit Card"

    And User enters card name "John"
    And User enters credit number "411111111"
    And User enters expiration "02/45"
    And User enters cvv "321"
    And User clicks the Submit button
    Then User should see no errors

    # run in terminal
    # mvn clean verify
    # to execute the bdd script

  #Step 1: