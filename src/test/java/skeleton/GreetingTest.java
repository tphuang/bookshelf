package skeleton;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features="src/test/resources/skeleton/greeting.feature", monochrome = true, format = {"pretty", "html:target/cucumber", "rerun:target/rerun.txt"})
public class GreetingTest {
}