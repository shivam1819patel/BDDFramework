Feature: refer a product to friend

  @referAFriend
  Scenario: Registered user should be able to refer a product to friend successfully.
    Given I am a registered user
    And I Log in into my account
    Given I back to home page
    When I click on Build your own computer
    When I click on Email a friend button
    Then I enter required Email a friend details
    And I click on send email button
    Then "Your message has been sent" should be seen successfully.