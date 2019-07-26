package gluecode;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Features/case1.feature","src/test/resources/Features/case2.feature","src/test/resources/Features/case3.feature","src/test/resources/Features/case4.feature"},plugin="json:target/Loginreport180.json")
//@CucumberOptions(features= "src/test/resources/Features/case4.feature",plugin="json:target/Loginreport12.json")
public class LoginRunner {

}
