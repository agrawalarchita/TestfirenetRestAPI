package pageObject;

import static io.restassured.RestAssured.given;

import utilities.payload;

public class verifyLogin extends payload {

	getToken token = new getToken();
	public void getLogin() {
		System.out.println("\n\n-------Verify user is logged in ----------");
		
		given().relaxedHTTPSValidation()
			.auth().oauth2(token.get_token())
		.when()
			.get(ROOT_URI + "/login")
		.then()
			.assertThat().statusCode(200)
			.log().body()
			.log().status();
	}
	
	public void getInvalidLogin() {
		System.out.println("-------various response codes for Verify Login ----------");
		
		given().relaxedHTTPSValidation()
			.auth().oauth2(invalidAuthTokenValue)
		.when()
			.get(ROOT_URI + "/login")
		.then()
			.assertThat().statusCode(401)
			.log().body()
			.log().status();
	}
	
}
