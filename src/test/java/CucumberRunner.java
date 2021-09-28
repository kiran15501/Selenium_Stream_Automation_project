import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="/Users/kiransubramanian/IdeaProjects/Demo_project/src/test/java/com/quinbay/cucumberDemo/feature" ,
        glue = {"com.quinbay.cucumberDemo"},
        tags="",
        plugin = {"rerun:target/rerun.txt", "json:target/destination/cucumber.json"} )
public class CucumberRunner {
}
