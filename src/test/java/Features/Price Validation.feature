@tag
Feature: Create a selenium framework by using IRCTC website

  Scenario Outline: Price validation from the mobile section
    Given open the Amazon webpage '<URL>'
    When logged into the login page
    Then navigate to the All left pane section
    And click on the Mobiles section
    Then click on the All mobile phones section
    And click on the '<Brands>' from the mobile page
    Then click on the specific '<Phone Model>' from the list
    And verify the '<price>' of the phone

    Examples: 
      | URL  | Brands | Phone Model | price |
      | QAURL | Apple | iPhone 16 Pro 256 GB | 1,26,900 |

  Scenario Outline: Price validation from the search bar
    Given open the Amazon webpage '<URL>'
    When logged into the login page
    Then search for the '<Phone Model>' from the search bar
    And click on the '<Phone Model>' in the list
    Then verify the '<price>' of the phone
    
    Examples:
    | URL | Phone Model | price |
    | QAURL | iPhone 16 Pro 256 GB | 1,26,900 |
    