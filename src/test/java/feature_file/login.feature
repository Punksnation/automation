Feature: login
  In order to Login to betway

  Scenario Outline: I want to login as a betway user
    Given I navigate to betway site '<URL>'
    And I enter mobilenumber '<mobilenumber>' and password '<password>'
    And I click on login button
    Then i should see Deposit '<deposit>', freebet '<freebet>', My Account '<myaccount>' and logout '<logout>'
    And close browser
    Examples:
      | URL                       | mobilenumber  | password       | deposit          | freebet | myaccount    | logout    |
      | https://qa.betway.com.gh/?nogeoredirect=1  | 839332966     | 123456 | depositBtnInline | free    | MyAccountBtn | LogoutBtn |
#      | https://qa.betway.co.ke   | 254835786250  | 123456 | depositBtnInline | free    | MyAccountBtn | LogoutBtn |
#      | https://qa.betway.ug/     | 835786250     | 123456 | depositBtnInline | free    | MyAccountBtn | LogoutBtn |
#      | https://qa.betway.co.zm/  | 839490828     | 123456 | depositBtnInline | free    | MyAccountBtn | LogoutBtn |
#      | https://qa.betway.com.ng/ | 2348386151491 | 123456 | depositBtnInline | free    | MyAccountBtn | LogoutBtn |
#      | https://qa.betway.co.za/  | 27835525963   | 123456 | depositBtnInline | free    | MyAccountBtn | LogoutBtn |
#
