package Geempower;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features={
//        "src/test/resources/features/AccountManagement.feature",
//        "src/test/resources/features/Dashboard.feature",
//        "src/test/resources/features/SavedLists.feature",
//        "src/test/resources/features/PriceAndAvailability.feature",
//        "src/test/resources/features/OrderEntry.feature",
        "src/test/resources/features/OrderStatus.feature"
})
public class DefinitionTestSuite {}
