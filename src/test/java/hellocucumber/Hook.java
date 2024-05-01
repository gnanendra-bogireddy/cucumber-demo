package hellocucumber;

import io.cucumber.java.*;

public class Hook {

    @Before("@conditionalhooks")
    public void doSomethingBefore(Scenario scenario) {
        scenario.log("Conditional hooks before annotation");
        System.out.println("Conditional hooks before annotation");
    }

    @Before
    public void doSomethingBeforeHooks(Scenario scenario) {
        scenario.log("Hooks before annotation");
        System.out.println("Hooks before annotation");
    }

    @After
    public void doSomethingAfterHooks(Scenario scenario) {
        scenario.log("Hooks after annotation");
        System.out.println("Hooks after annotation");
    }

    @AfterStep
    public void doSomethingAfterStep(Scenario scenario) {
        scenario.log("Hooks after step annotation");
        System.out.println("Hooks after step annotation");
    }

    @BeforeStep
    public void doSomethingBeforeStep(Scenario scenario) {
        scenario.log("Hooks before step annotation");
        System.out.println("Hooks before step annotation");
    }
}
