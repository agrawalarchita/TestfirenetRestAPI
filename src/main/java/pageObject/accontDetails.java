package pageObject;

import static io.restassured.RestAssured.given;

import utilities.payload;

public class accontDetails extends payload {
	
	getToken token = new getToken();
	
	public void getAccountDetails() {				
		
		System.out.println("\n\n-------Verify account details ------");
		
		given().relaxedHTTPSValidation()
			.header(auth, token.get_token())
		.when()
			.get(ROOT_URI + "/account")
		.then()
			.assertThat().statusCode(200)
			.log().body()
			.log().status();
	}

}
