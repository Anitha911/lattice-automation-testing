package stepDefinitions;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.json.JSONObject;
import utils.ApiUtils;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class LoginAPISteps {

    String baseUrl;
    String username;
    String password;
    Response response;

    @Given("the API endpoint is {string}")
    public void setApiEndpoint(String url) {
        this.baseUrl = url;
    }

    @Given("the login credentials are:")
    public void setCredentials(io.cucumber.datatable.DataTable dataTable) {
        this.username = dataTable.cell(1,0);
        this.password = dataTable.cell(1,1);
    }

    @When("I send the login request")
    public void sendLoginRequest() {

        JSONObject body = new JSONObject();
        body.put("UserName", username);
        body.put("Password", password);

        response = given()
                .relaxedHTTPSValidation()
                .header("Content-Type", "application/json")
                .body(body.toString())
                .post(baseUrl + "/CheckAuthenticationTechApp");
    }

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int code) {
        response.then().statusCode(code);
    }

    @Then("the response should contain a valid token")
    public void verifyToken() {
        response.then().body("AuthenticationToken", notNullValue());
    }

    @When("I call AddTeamMemberWO API with:")
    public void addTeamMember(io.cucumber.datatable.DataTable table) {
        String workOrderId = table.cell(1,0);
        String staffId = table.cell(1,1);

        JSONObject body = new JSONObject();
        body.put("WorkOrderId", workOrderId);
        body.put("StaffId", staffId);

        response = ApiUtils.post(baseUrl + "/AddTeamMemberWO", body.toString());
    }

}
