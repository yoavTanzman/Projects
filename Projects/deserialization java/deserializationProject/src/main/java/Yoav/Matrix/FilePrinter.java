package Yoav.Matrix;

import org.apache.commons.io.FilenameUtils;

import Yoav.Matrix.Util.JsonUtil;
import Yoav.Matrix.Util.XmlUtil;

public class FilePrinter {
	
	public static void printFile(String filePath)
	{
		
	String extention=FilenameUtils.getExtension(filePath).toLowerCase();
	
		if(extention.equals("json")){
			JsonUtil.printJsonFile(filePath);
		}
		else if(extention.equals("xml")){
			XmlUtil.printXml(filePath);
		}
		else{
			System.out.println("we dont support files of this extention");
		}
	}
}