package hellocucumber;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("background step def")
    public void backGround() {
        System.out.println("Background scenario");
    }

    @Given("an example scenario")
    public void anExampleScenario() {
        System.out.println("an example scenario");
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
        System.out.println("all step definitions are implemented");
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
        System.out.println("the scenario passes");
    }

    @Given("I have {int} cukes in my belly")
    public void i_have_n_cukes_in_my_belly(int cukes) {
        System.out.format("Cukes: %n\n", cukes);
        throw new RuntimeException("Exception occurred");
    }

    @ParameterType("red|blue|yellow")  // regexp
    public Color color(String color){  // type, name (from method)
        return new Color(color);       // transformer function
    }

    @Given("I have {int} {color} mangoes in my(our) belly/stomach")
    public void i_have_n_mangoes_in_my_belly(int mangoes, Color color) {
        System.out.println("Mangoes : " +mangoes);
        System.out.println("Mangoes color : " +Color.colorResult());
    }

    @Given("I have {int} code editor(s) installed/uninstall in my machine/vdi")
    public void i_have_code_editors_installed_in_my_machine(Integer int1) {
        throw new RuntimeException("Exception occurred");
    }
    @When("^I use only (\\d+) code editor$")
    public void i_use_only_code_editor(Integer int1) {
        System.out.println("Integer num : " +int1);
        throw new RuntimeException("Exception occurred");
    }
    @Then("I {word} another {string} from my {}")
    public void i_uninstall_another_code_editor_from_my_machine(String word, String string, String anonymous) {

    }

}
