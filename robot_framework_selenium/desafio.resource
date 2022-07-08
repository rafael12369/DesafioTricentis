*** Variables ***
${SITE}                           http://sampleapp.tricentis.com/101/app.php
${BROWSER}                        Chrome 

#Selectors and variables
#Vehicle data tab 
${MAKE_BOX}                       css=#make > option:nth-child(3)
${MODEL_BOX}                      css=#model > option:nth-child(5)
${CYLINDER_BOX}                   css=#cylindercapacity
${CYLINDER_QTY_TEXT}              313 
${ENGINE_PERFORMARNCE_BOX}        css=#engineperformance
${ENGINE_PERFORMANCE_TEXT}        25 
${DATE_MANUFACTURE_BOX}           css=#dateofmanufacture
${DATE_MANUFACTURE_TEXT}          06/01/2022
${NUMBER_OF_SEATS_OPTION}         css=#numberofseats > option:nth-child(3)
${RIGHT_HAND_DRIVE_YES}           css=#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span
${NUMBER_OF_SEATS_OPTION2}        css=#numberofseatsmotorcycle > option:nth-child(3)
${PETROL_FUEL_OPTION}             css=#fuel > option:nth-child(2)
${PAYLOAD_BOX}                    css=#payload
${PAYLOAD_TEXT}                   169
${TOTAL_WEIGHT_BOX}               css=#totalweight
${TOTAL_WEIGHT_TEXT}              344
${LIST_PRICE_BOX}                 css=#listprice
${LIST_PRICE_TEXT}                5945
${LICENSE_PLATE_NUMBER_BOX}       css=#licenseplatenumber 
${LICENSE_PLATE_NUMBER_TEXT}      1234
${ANNUAL_MILEAGE_BOX}             css=#annualmileage              
${ANNUAL_MILEAGE_TEXT}            22000
${NEXT_BOX}                       css=#nextenterinsurantdata

#Insurant data tab
${FIRST_NAME_BOX}                 css=#firstname
${FIRST_NAME_TEXT}                Rafael
${LAST_NAME_BOX}                  css=#lastname
${LAST_NAME_TEXT}                 Martinez
${DATE_OF_BIRTH_BOX}              css=#birthdate
${DATE_OF_BIRTH_TEXT}             05/01/2003
${GENDER_MALE_BOX}                css=#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span
${STREET_ADDRESS_BOX}             css=#streetaddress
${STREET_ADDRESS_TEXT}            Rua guilherme ribeiro de faria
${COUNTRY_OPTION_BOX}             css=#country > option:nth-child(32)
${ZIP_CODE_BOX}                   css=#zipcode
${ZIP_CODE_TEXT}                  11674290
${CITY_BOX}                       css=#city
${CITY_TEXT}                      Caraguatatuba
${OCCUPATION_OPTION_BOX}          css=#occupation > option:nth-child(5)
${HOBBIES_OPTION_BOX}             css=#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span
${WEBSITE_BOX}                    css=#website
${WEBSITE_TEXT}                   https://www.linkedin.com/in/rafaelmartinezqa/
${NEXT_BOX2}                      css=#nextenterproductdata

#Product data tab
${START_DATE_BOX}                 css=#startdate
${START_DATE_TEXT}                07/04/2023
${INSURANCE_OPTION_BOX}           css=#insurancesum > option:nth-child(4)
${MERIT_RATING_OPTION_BOX}        css=#meritrating > option:nth-child(10)
${DAMAGE_INSURANCE_OPTION_BOX}    css=#damageinsurance > option:nth-child(4)
${EURO_PROTECTION_OPTION_BOX}     css=#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span
${COURTESY_CAR_OPTION_BOX}        css=#courtesycar > option:nth-child(3)
${NEXT_BOX3}                      css=#nextselectpriceoption

#Price option tab
${ULTIMATE_OPTION_BOX}            css=#priceTable > tfoot > tr > th.group > label:nth-child(4) > span
${NEXT_BOX4}                      css=#nextsendquote

#Send quote tab
${EMAIL_BOX}                      css=#email
${EMAIL_TEXT}                     rafaelmartinez.qa@gmail.com
${PHONE_BOX}                      css=#phone
${PHONE_TEXT}                     12981787456
${USERNAME_BOX}                   css=#username
${USERNAME_TEXT}                  RafaelQA
${PASSWORD_BOX}                   css=#password
${PASSWORD_TEXT}                  Martinez1
${CONFIRM_PASSWORD_BOX}           css=#confirmpassword
${COMMENTS_BOX}                   css=#Comments
${COMMENTS_TEXT}                  Hire me :D
${SEND_BOX}                       css=#sendemail
${EMAIL_SUCESS_BOX}               css=body > div.sweet-alert.showSweetAlert.visible > h2
${EMAIL_SUCESS_TEXT}              Sending e-mail success!

#Automation
*** Keywords ***
Given the user opens the trincentis website
  Open Browser                     ${SITE}                         ${BROWSER}
  Maximize Browser Window
#  Set Selenium Speed        0.1
 

When he fills in the form on the “Enter Vehicle Data” tab and press next
  Wait and Click                   ${MAKE_BOX}
  Wait and Click                   ${MODEL_BOX}
  Wait and Input Text              ${CYLINDER_BOX}                 ${CYLINDER_QTY_TEXT}    
  Wait and Input Text              ${ENGINE_PERFORMARNCE_BOX}      ${ENGINE_PERFORMANCE_TEXT}
  Wait and Input Text              ${DATE_MANUFACTURE_BOX}         ${DATE_MANUFACTURE_TEXT}
  Wait and Click                   ${NUMBER_OF_SEATS_OPTION}
  Wait and Click                   ${RIGHT_HAND_DRIVE_YES}
  Wait and Click                   ${NUMBER_OF_SEATS_OPTION2}
  Wait and Click                   ${PETROL_FUEL_OPTION}
  Wait and Input Text              ${PAYLOAD_BOX}                  ${PAYLOAD_TEXT}
  Wait and Input Text              ${TOTAL_WEIGHT_BOX}             ${TOTAL_WEIGHT_TEXT}
  Wait and Input Text              ${LIST_PRICE_BOX}               ${LIST_PRICE_TEXT}
  Wait and Input Text              ${LICENSE_PLATE_NUMBER_BOX}     ${LICENSE_PLATE_NUMBER_TEXT}
  Wait and Input Text              ${ANNUAL_MILEAGE_BOX}           ${ANNUAL_MILEAGE_TEXT}
  Wait and Click                   ${NEXT_BOX}


And he fills in the form on the “Enter Insurant Data” tab and press next
  Wait and Input Text              ${FIRST_NAME_BOX}               ${FIRST_NAME_TEXT}
  Wait and Input Text              ${LAST_NAME_BOX}                ${LAST_NAME_TEXT}
  Wait and Input Text              ${DATE_OF_BIRTH_BOX}            ${DATE_OF_BIRTH_TEXT}
  Wait and Click                   ${GENDER_MALE_BOX}
  Wait and Input Text              ${STREET_ADDRESS_BOX}           ${STREET_ADDRESS_TEXT}
  Wait and Click                   ${COUNTRY_OPTION_BOX}
  Wait and Input Text              ${ZIP_CODE_BOX}                 ${ZIP_CODE_TEXT}
  Wait and Input Text              ${CITY_BOX}                     ${CITY_TEXT}
  Wait and Click                   ${OCCUPATION_OPTION_BOX}
  Wait and Click                   ${HOBBIES_OPTION_BOX}
  Wait and Input Text              ${WEBSITE_BOX}                  ${WEBSITE_TEXT}
  Wait and Click                   ${NEXT_BOX2}


And he fills in the form on the “Enter Product Data” tab and press next
  Wait and Input Text              ${START_DATE_BOX}               ${START_DATE_TEXT}
  Wait and Click                   ${INSURANCE_OPTION_BOX}
  Wait and Click                   ${MERIT_RATING_OPTION_BOX}
  Wait and Click                   ${DAMAGE_INSURANCE_OPTION_BOX}
  Wait and Click                   ${EURO_PROTECTION_OPTION_BOX}
  Wait and Click                   ${COURTESY_CAR_OPTION_BOX}
  Wait and Click                   ${NEXT_BOX3}


And he fills in the form on the “Select Price Option” tab and press next
  Wait and Click                   ${ULTIMATE_OPTION_BOX}
  Wait and Click                   ${NEXT_BOX4}


And he fills in the form on the “Send Quote” tab and press send
  Wait and Input Text              ${EMAIL_BOX}                    ${EMAIL_TEXT}
  Wait and Input Text              ${PHONE_BOX}                    ${PHONE_TEXT}
  Wait and Input Text              ${USERNAME_BOX}                 ${USERNAME_TEXT}
  Wait and Input Text              ${PASSWORD_BOX}                 ${PASSWORD_TEXT}
  Wait and Input Text              ${CONFIRM_PASSWORD_BOX}         ${PASSWORD_TEXT}
  Wait and Input Text              ${COMMENTS_BOX}                 ${COMMENTS_TEXT}
  Wait and Click                   ${SEND_BOX}
 

Then he checks the message “Sending email successfully!” on the screen
  Wait and Validate                ${EMAIL_SUCESS_BOX}             ${EMAIL_SUCESS_TEXT}



#custom methods
Wait and Click
  [Arguments]                     ${ELEMENT}
  Wait Until Element is Visible   ${ELEMENT}                       30
  Click Element                   ${ELEMENT}


Wait and Input Text
  [Arguments]                     ${ELEMENTO}                      ${TEXTO}
  Wait Until Element is Visible   ${ELEMENTO}                      30
  Input Text                      ${ELEMENTO}                      ${TEXTO}


Wait and Validate
  [Arguments]                     ${ELEMENT}  ${ELEMENT2}
  Wait Until Element is Visible   ${ELEMENT}                       30
  Element Should Contain          ${ELEMENT}  ${ELEMENT2}