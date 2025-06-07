package Tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import java.io.DataInput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class testone {
	@Test
	public void get() {
		
		Map<String, Object> dataMap = new LinkedHashMap<String, Object>();
        dataMap.put("year", 2019);
        dataMap.put("price", 1849.99);
        dataMap.put("CPU model", "Intel Core i9");
        dataMap.put("Hard disk size", "1 TB");
				
		
		JSONObject req = new JSONObject(new LinkedHashMap<>());
		req.put("name", "Apple MacBook Pro 16");
		req.put("data" ,dataMap);
		
		System.out.println(req.toJSONString());
		
		baseURI = "https://api.restful-api.dev";
		
		given().header("Content-Type", "application/json").body(req.toJSONString()).when().post("/objects").then().statusCode(200);
		
		
	}
	
	

}
