package RestAssured;

import static org.junit.Assert.assertEquals;

import org.testng.Assert;

import okhttp3.Response;
import okhttp3.ResponseBody;

public class API {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response responsiv= get("https://reqres.in/api/users?pages=2");
		responsiv.prettyPrint();
		int statusof=responsiv.statusCode();
		System.out.println(statusof);
Assert.assertEquals(statusof,  200);
ResponseBody verifing =responsiv.getBody();
String  converts=verifing.asString();

assert.assertEquals(converts.contains("Funke"), true);





	}

}
