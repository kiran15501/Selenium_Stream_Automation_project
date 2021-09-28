Feature: Test Stream website
  Background: User navigates to Stream
    Given I am on Stream page


#  Scenario:
#    When search "Adventure"
#    And click fliter ACTION and ADVENTURE
#    Then check search and filter
#    And close
#
#  Scenario:
#    When search "Adventure"
#    And click fliter ACTION and ADVENTURE
#    And check search and filter
#    And slide to "1250"and click Special Offer
#    Then check slider and special offer
#    And close
#
#  Scenario:
#    When search "Adventure"
#    And click fliter ACTION and ADVENTURE
#    And check search and filter
#    And slide to "1250"and click Special Offer
#    And check slider and special offer
#    And SortBy name
#    Then Check name
#    And close
#
#Scenario:
#    When search "Adventure"
#    And click fliter ACTION and ADVENTURE
#    And check search and filter
#    And slide to "1250"and click Special Offer
#    And check slider and special offer
#    And SortBy name
#    And Check name
#    And TO game details page
#    And Add to cart
#    And Click continue
#    Then Check cart
#  And close
#
#  Scenario:
#    When search "Adventure"
#    And click fliter ACTION and ADVENTURE
#    And slide to "1250"and click Special Offer
#    And SortBy name
#    And TO game details page
#    And Add to cart
#    And Click continue
#    Then Repate first five steps and check
#    And close
#
#    Scenario:
#      When search "Adventure"
#      And click fliter ACTION and ADVENTURE
#      And slide to "1250"and click Special Offer
#      And SortBy name
#      And TO game details page
#      And Add to cart
#      And Click continue
#      And Repate first five steps and check
#      And Navigate back and click another product
#      Then Add to carttwo and verify total
#      And close

  Scenario:
    When search "Adventure"
    And click fliter ACTION and ADVENTURE
    And check search and filter
    And slide to "1250"and click Special Offer
    And check slider and special offer
    And SortBy name
    And Check name
    And TO game details page
    And Add to cart
    And Click continue
    And Check cart
    And Repate first five steps and check
    And Navigate back and click another product
    And Add to carttwo and verify total
    And remove a product
    Then verfy total
    And close

