package pageObject;

import static io.restassured.RestAssured.given;

import utilities.payload;

public class logOut extends payload {
	
	public void getLogout() {
		System.out.println("\n\n------Perform Logout --------- ");
		
		given().relaxedHTTPSValidation()
		.when()
			.get(ROOT_URI + "/logout")
		.then()
			.assertThat().statusCode(200)
			.log().body()
			.log().status();
		
	}

}
