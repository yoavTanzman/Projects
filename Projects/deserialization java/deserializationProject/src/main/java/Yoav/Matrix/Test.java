package Yoav.Matrix;

import java.util.ArrayList;

import Yoav.Matrix.Util.JsonUtil;
import Yoav.Matrix.Util.XmlUtil;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpNo(1);
		emp.setName("Yoav");
		emp.setSalary(15000);
			
		String jsonEmployee= JsonUtil.convertJavaToJson(emp);
		System.out.println(jsonEmployee);
		System.out.println("============================================");
		Employee empTest = JsonUtil.convertJsonToJava(jsonEmployee, Employee.class); 	
		System.out.println(empTest.getEmpNo()+" "+empTest.getName()+" "+empTest.getSalary());
		
		System.out.println("============================================");
		System.out.println("XML FILE");
		XmlUtil.printXml("people.xml");
		System.out.println("============================================");
		System.out.println("Json preetyPrint");
		JsonUtil.printJsonFile("test.json");
		System.out.println("============================================");
		System.out.println("Check file extention");
		FilePrinter fp = new FilePrinter();
		fp.printFile("Tomyoajfashk.txt");
		System.out.println();
		fp.printFile("people.xml");
		fp.printFile("test.json");

		
	}

}
