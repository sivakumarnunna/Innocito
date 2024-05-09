package interview123;

import com.model.StudentModel;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.response.*;
public class TestClass {
	
	
     public static void main(String[] args) {
		
    	RequestSpecification reqspec =  RestAssured.given();
    	
    	reqspec.baseUri("http://universities.hipolabs.com/search");
    	
    	Response response = reqspec.when().get();
    	
    	StudentModel[] model = response.getBody().as(StudentModel[].class);
    	
        for(StudentModel sm : model) {
        	
        	if(sm.getCountry().equalsIgnoreCase("france")) {
        		System.out.println(sm.getName());
        	}
        	
        }
    	 
	}	
	

}
