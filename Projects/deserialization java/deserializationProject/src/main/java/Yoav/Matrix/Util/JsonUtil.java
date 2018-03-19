package Yoav.Matrix.Util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtil {
	
	private static ObjectMapper mapper;
	static{
		mapper=new ObjectMapper();
	}
	
	public static String convertJavaToJson(Object object){
		String jasonResult="";
		 try {
			jasonResult=mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			System.out.println("Exception occured while converting java obj into json"+e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("Exception occured while converting java obj into json"+e.getMessage());
		} catch (IOException e) {
			System.out.println("Exception occured while converting java obj into json"+e.getMessage());
		}
		 return jasonResult; 
	}
	
	
	public static <T> T convertJsonToJava(String jsonString, Class <T> cls)
	{
		T result=null;
		try {
			result = mapper.readValue(jsonString,cls);
		} catch (JsonParseException e) {
			System.out.println("Exception occured while converting the json into java"+e.getMessage());
			e.printStackTrace();
		} catch (JsonMappingException e) {
			System.out.println("Exception occured while converting the json into java"+e.getMessage());

		} catch (IOException e) {
			System.out.println("Exception occured while converting the json into java"+e.getMessage());

		}
		return result;
	}
	
	public static void printJsonFile(String jsonFileName)
	{
		JSONParser parser = new JSONParser();
		
		try {
			Object obj = parser.parse(new FileReader(jsonFileName));
			JSONObject jsonObject = (JSONObject) obj;
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonObject));
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
