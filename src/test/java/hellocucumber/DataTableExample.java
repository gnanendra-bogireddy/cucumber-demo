package hellocucumber;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTableExample {

    @Given("a datatable:")
    public void a_data_table(DataTable table) {
        List<List<String>> listOfLists = table.transpose().asLists();
        for (int i = 0; i < listOfLists.size(); i++) {
            for (int j = 0; j < listOfLists.get(0).size(); j++) {
                System.out.println("Printing data table elements parsed from data table transpose : " + " i value " + i + " j value " + j + " " + listOfLists.get(i).get(j));
            }
        }
    }

    @Given("a datatable as a list of maps:")
    public void a_data_table_of_list_of_maps(List<Map<String, String>> table) {
        for (Map<String, String> stringMap : table) {
            System.out.println("Printing data table elements parsed from list of maps : " + stringMap.getOrDefault("elements", "defaultValue1"));
            System.out.println("Printing data table elements parsed from list of maps : " + stringMap.getOrDefault("index", "defaultValue2"));
        }
    }

    @Given("a datatable as a list of lists:")
    public void a_data_table_of_list_of_lists(List<List<String>> table) {
        for (int i = 0; i < table.size(); i++) {
            for (int j = 0; j < table.get(0).size(); j++) {
                System.out.println("Printing data table elements parsed from data table transpose : " + " i value " + i + " j value " + j + " " + table.get(i).get(j));
            }
        }
    }

    @Given("the following animals:")
    public void the_following_animals(List<String> animals) {
        for (String string : animals) {
            System.out.println("Printing data table elements parsed from list of strings : " + string);
        }

    }

    @Given("the following table as Map of Map")
    public void the_following_table_as_map_of_map(Map<String, Map<String, String>> mapOfMap) {
        System.out.println("Printing data table elements parsed from list of strings : " + mapOfMap.get("row1").getOrDefault("key1", "Null Value"));
        System.out.println("Printing data table elements parsed from list of strings : " + mapOfMap.get("row1").getOrDefault("key2", "Null Value"));
        System.out.println("Printing data table elements parsed from list of strings : " + mapOfMap.get("row1").getOrDefault("key3", "Null Value"));

        System.out.println("Printing data table elements parsed from list of strings : " + mapOfMap.get("row2").getOrDefault("key1", "Null Value"));
        System.out.println("Printing data table elements parsed from list of strings : " + mapOfMap.get("row2").getOrDefault("key2", "Null Value"));
        System.out.println("Printing data table elements parsed from list of strings : " + mapOfMap.get("row2").getOrDefault("key3", "Null Value"));

        System.out.println("Printing data table elements parsed from list of strings : " + mapOfMap.get("row3").getOrDefault("key1", "Null Value"));
        System.out.println("Printing data table elements parsed from list of strings : " + mapOfMap.get("row3").getOrDefault("key2", "Null Value"));
        System.out.println("Printing data table elements parsed from list of strings : " + mapOfMap.get("row3").getOrDefault("key3", "Null Value"));

    }

}
