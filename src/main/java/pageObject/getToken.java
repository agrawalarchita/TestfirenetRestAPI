package pageObject;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import utilities.payload;

public class getToken extends payload {
	
	
	public String get_token() {

		String tokenValue = given().relaxedHTTPSValidation().contentType(ContentType.JSON)
									.body(validLogin)
							.when()
									.post(ROOT_URI + "/login")

							.then()
									.extract().path(auth);
							return (tokenValue);

	}

}
