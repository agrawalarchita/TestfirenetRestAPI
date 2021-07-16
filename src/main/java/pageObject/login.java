package pageObject;


import io.restassured.http.ContentType;
import utilities.payload;

import static io.restassured.RestAssured.*;

public class login extends payload {
     

	public void postLogin() {	
		
		System.out.println("-----Perform login------- ");  
		given().relaxedHTTPSValidation()
			.contentType(ContentType.JSON)
			.body(validLogin)
		.when()
			.post(ROOT_URI + "/login")
		.then()
			.assertThat().statusCode(200)
			.log().body()
			.log().status();
		

	}

	public void postinvalidLogin() {
		System.out.println("\n\n-------various response codes for Perform Login --------");
		
		given().relaxedHTTPSValidation()
			.contentType(ContentType.JSON)
			.body(inValidLogin)
		.when()
			.post(ROOT_URI + "/login")
	    .then()	
	    	.assertThat().statusCode(400)
	    	.log().body()
	    	.log().status();
	}	
	

}
