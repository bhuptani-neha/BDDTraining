Feature: Withdraw cash from account
  In order to pay for my daily expenses
  As an Account Holder
  I want to withdraw cash

  Scenario: Withdraw cash from my account in credit
    Given I have a balance of $100 in my account
    When I request $20
    Then $20 should be dispensed
    And I should have balance of $80 in my account
