package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resource\\com\\features\\Shortlist\\homePage.feature",
glue= {"com.stepdefination.RLL_240Testinh_FirstCry_Shortlist"},
plugin= {"pretty","html:target/cucumber-reports"},
tags="@access_shortlist_01"
)

public class HomepageRunner extends AbstractTestNGCucumberTests {
}
