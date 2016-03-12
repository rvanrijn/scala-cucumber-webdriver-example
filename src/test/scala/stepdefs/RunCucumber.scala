package stepdefs

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources/features"),
  glue = Array("stepdefs"),
  plugin = Array("pretty", "html:target/cucumber-report"),
  tags = Array("@wip")
)
class RunCucumber {
}
