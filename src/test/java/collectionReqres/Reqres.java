package collectionReqres;



import org.hamcrest.Matchers;
import org.hamcrest.core.IsEqual;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.matcher.RestAssuredMatchers;

import static io.restassured.RestAssured.*;



public class Reqres 
{
	String baseuri="https://reqres.in";
	String endpoint="/api/users/2";
	
	
	@Test
	void listUsers()
	{
		 given()
		 
		 .when()
		 		.get(baseuri+ endpoint)
		 
		 .then()
		 		.statusCode(200).log().all();
	}

}
