package pageObject;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import utilities.payload;

public class transferFunds extends payload {

	getToken token = new getToken();
	
	public void postTransferfunds() {
		System.out.println("\n\n-------Verify successful funds transfer between accounts --------");
		
		given().relaxedHTTPSValidation()
			.contentType(ContentType.JSON)
			.header(auth, token.get_token())
			.body(transferFunds)
		.when()
			.post(ROOT_URI + "/transfer")
		.then()
			.assertThat().statusCode(200)
			.log().body()
			.log().status();
	}
	public void postinvalidTransferfunds() {
		System.out.println("-------various response codes for Transfer Funds --------");
		
		given().relaxedHTTPSValidation()
			.contentType(ContentType.JSON)
			.header(auth, token.get_token())
			.body(invalidtransferFunds)
		.when()
			.post(ROOT_URI + "/transfer")
		.then()
			.assertThat().statusCode(500)
			.log().body()
			.log().status();
	}
}
