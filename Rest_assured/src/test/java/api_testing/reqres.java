package api_testing;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class reqres {
	@Test 
	
	public void ListOfviewrs() {
		//given- start building the request
		//then() - validate the response
		//.log().all(); - prints all the responce info
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();
		
		
	}
@Test
public void single_user() {
	given().get("https://reqres.in/api/users/2").then().statusCode(200).log().all();
}

@Test
public void single_usernot_found() {
	given().get("https://reqres.in/api/users/23").then().statusCode(404).log().all();
}	
@Test
public void create() {
	JSONObject json = new JSONObject();
	json.put("name","shivani");
	json.put("job", "SDET");
	given().body(json.toString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	
	
}
}
