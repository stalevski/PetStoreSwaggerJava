import dtoBuilders.*;
import dtos.*;
import enums.StatusEnums;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import randomDataGenerator.RandomDataGenerator;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCases extends TestBase {
    PetDto pet;
    UserDto user;


    @BeforeEach
    public void BeforeEach() {
        var categoryBuilder = new CategoryBuilder()
                .WithId(RandomDataGenerator.generateRandomLongInRange(1, 99999))
                .WithName(RandomDataGenerator.generateRandomString(20));

        var category = new CategoryDto(categoryBuilder);

        var tagBuilder = new TagBuilder()
                .WithId(RandomDataGenerator.generateRandomLongInRange(1, 99999))
                .WithName(RandomDataGenerator.generateRandomString(20));

        var tag = new TagDto(tagBuilder);

        var petBuilder = new PetBuilder()
                .WithId(RandomDataGenerator.generateRandomLongInRange(1, 99999))
                .WithCategory(category)
                .WithPhotoUrl(RandomDataGenerator.generateRandomString(20))
                .WithName(RandomDataGenerator.generateRandomString(20))
                .WithTags(tag)
                .WithStatus(StatusEnums.AVAILABLE.stringValue);

        pet = new PetDto(petBuilder);
        user = UserDto.builder()
                .id(RandomDataGenerator.generateRandomIntBetween(1,99999))
                .username(RandomDataGenerator.generateRandomString(20))
                .firstName(RandomDataGenerator.generateRandomString(20))
                .lastName(RandomDataGenerator.generateRandomString(20))
                .email(RandomDataGenerator.generateRandomString(20)+"@"+RandomDataGenerator.generateRandomString(5)+".com")
                .password(RandomDataGenerator.generateRandomString(20))
                .phone(String.valueOf(RandomDataGenerator.generateRandomIntBetween(11111,99999)))
                .userStatus(RandomDataGenerator.generateRandomIntBetween(1,10))
                .build();
    }

    @Test
    public void testPostRequest() {
        var response = postPet(pet);

        assertEquals(gson.toJson(pet), response.asString());
    }
}
