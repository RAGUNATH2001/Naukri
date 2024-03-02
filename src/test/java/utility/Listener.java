package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.restassured.RestAssured;

public class Listener implements ITestListener {
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("Method passed "+ result.getName());
	
	String SuccessMessage = "Profile SuccessFully Updated : "+result.getName();
	apitrigger(SuccessMessage);

	}
	
	@Override
	public void onTestFailure(ITestResult result) {
	System.out.println("Method failed"+ result.getName());
	String failerMessage = "unable to update Profile :  "+result.getName();
	apitrigger(failerMessage);
	

	}
	
	public void apitrigger(String Messgage) {
		int statusCode = RestAssured.given()
				.queryParam("chat_id", "@raguapi")
				.queryParam("text", Messgage).when().get("https://api.telegram.org/bot6716390977:AAEWgDprPaEVM7Ee-wSQfCL_lzf2uS3-9mQ/sendmessage") .getStatusCode();
				
				System.out.println(statusCode);
		
	}

}
