Feature: Test

Scenario: Testing 1
   When User Open FireFox Driver
   And User Opens facebook
   And User fills sign up form
    |Type|Field|Value|
    |textbox|name|Ashu|
    |textbox|lastname|Choudhary|
    |textbox|email|abc@abc.com|
    |textbox|emailConfirmation|abc@abc.com|
    |textbox|password|abcd|
    |radio|sex|null|
    |dropdown|day|31|
    |dropdown|month|10|
    |dropdown|year|1990|
    |button|signup|null|
    
   
    
    
Scenario: Testing 2
   When User Open FireFox Driver
   And User Opens facebook
   And User fills sign up form
    |Type|Field|Value|
    |textbox|name|Sakshi|
    |textbox|lastname|Choudhary|
    |textbox|email|abc@abc.com|
    |textbox|emailConfirmation|abc@abc.com|
    |textbox|password|abcd|
    |radio|sex|null|
    |dropdown|day|26|
    |dropdown|month|7|
    |dropdown|year|1994|
    |button|signup|null|
    