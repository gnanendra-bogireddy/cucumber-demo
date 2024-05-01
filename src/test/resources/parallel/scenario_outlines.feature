Feature: Scenario Outlines feature file

  Scenario Outline: <scen_out_row_num>
    Given Step from '<scen_out_row_num>' in 'scenario-outlines' feature file

    @tag1
    Examples:
      | scen_out_row_num       |
      | Scenario Outline Row 1 |
      | Scenario Outline Row 2 |

    @tag2
    Examples:
      | scen_out_row_num       |
      | Scenario Outline Row 1 |
      | Scenario Outline Row 2 |