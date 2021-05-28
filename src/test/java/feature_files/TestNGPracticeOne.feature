

Feature: Practice1, verify address operations

  Scenario: Create Case

    When fill the form text fields as below:
      | First Name | Umed         |
      | Last Name  | Murodov      |
      | Address    | 3849 4th ave |
      | City       | Brooklyn     |
    And randomly select an option from the "State" dropdown list

    And fill the form text fields as below:
      | Zip/Postal Code | 11218        |
      | Home phone      | 929999277    |
      | Address title   | New Address2 |

