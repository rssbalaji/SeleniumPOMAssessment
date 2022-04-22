package StepDefinition;

import Pojo.PostApiPojo;
import com.test.restassured.FirstRestAssured;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class RestAssuredTestCases {

    FirstRestAssured firstRestAssured = new FirstRestAssured();
    Response response;
    String remainingURL;

    @Given("user has the api url")
    public void userHasTheAPIUrl(){

    remainingURL = "/store/order";

    }

    @When("user executes the API with the given details")
    public void user_executes_the_api_with_the_given_details(DataTable dataTable) {

        List<Map<String, String>> jsonBody = dataTable.asMaps();
        response = firstRestAssured.thirdRestMethodPost(jsonBody.get(0),remainingURL);

    }

    @Then("user asserts the response status")
    public void user_asserts_the_response_status() {

        if(response.getStatusCode()==200){
            Assert.assertTrue(true,"API got success");
        }else {
            Assert.assertFalse(false,"API got failed");
        }


    }

}
