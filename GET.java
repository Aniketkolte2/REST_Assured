package Tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import java.io.DataInput;

public class testone {
	@Test
	public void get() {
		baseURI = "https://reqres.in/api";
		
		given().get("/users?page=2").then().statusCode(200).body("data[4].first_name", equalTo("George"));
	}
	
	

}
