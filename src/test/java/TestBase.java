import com.google.gson.Gson;
import dtos.PetDto;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestBase {
    // Define the base URI
    private static final String baseUri = "https://petstore.swagger.io/v2";
    private static final String petUrl = "/pet";
    private static final String userUrl = "/user";
    static Gson gson = new Gson();

    public static Response postPet(PetDto pet) {
        // Define the request body (JSON payload)
        String requestBody = gson.toJson(pet);

        // Make the POST request
        Response response = given()
                .baseUri(baseUri)
                .contentType("application/json")
                .when()
                .body(requestBody)
                .post(petUrl);

        response.then().statusCode(200);

        return response;
    }

    public static Response getPetById(PetDto pet) {
        Response response = given()
                .when()
                .get(petUrl + "/" + pet.id);

        response.then().statusCode(200);

        return response;
    }

    public static Response deletePetById(PetDto pet) {
        Response response = given()
                .when()
                .delete(petUrl + "/" + pet.id);

        response.then().statusCode(200);

        return response;
    }
}
