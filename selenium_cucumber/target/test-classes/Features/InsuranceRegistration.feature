#Author: rafaelmartinez.qa@gmail.com
#Date: 05/07/2022

@SmokeFeature
Feature: Feature to test insurance registration
  
  @smoketest
  Scenario: Check the successful sending of the insurance email with valid data
    Given the user opens the trincentis website
    When he fills in the form on the “Enter Vehicle Data” tab and press next
    And he fills in the form on the “Enter Insurant Data” tab and press next
    And he fills in the form on the “Enter Product Data” tab and press next
    And he fills in the form on the “Select Price Option” tab and press next
    And he fills in the form on the “Send Quote” tab and press send
    Then he checks the message “Sending email successfully!” on the screen
