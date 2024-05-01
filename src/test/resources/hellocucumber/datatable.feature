Feature: Datatable example

  Scenario: Datatable scenario
    Given the following animals:
      | cow   |
      | horse |
      | sheep |
    And a datatable:
      | list1,1 | list1,2 | list1,3 |
      | list2,1 | list2,2 | list2,3 |
      | list3,1 | list3,2 | list3,3 |
    And a datatable as a list of maps:
      | elements | index |
      | map1     | 0     |
      | map2     | 1     |
    And a datatable as a list of lists:
      | list1,1 | list1,2 | list1,3 |
      | list2,1 | list2,2 | list2,3 |
      | list3,1 | list3,2 | list3,3 |
    And the following table as Map of Map
      |      | key1  | key2  | key3  |
      | row1 | val11 | val12 | val13 |
      | row2 | val21 |       | val23 |
      | row3 | val31 | val32 | val33 |

