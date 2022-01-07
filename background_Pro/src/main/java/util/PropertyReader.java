package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	private static FileInputStream obj_FileinpuFileInputStream;
	private static Properties obj_Properties;
	public  Properties  properyReader() {
		try {
			obj_FileinpuFileInputStream=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configuration/config.properties");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		obj_Properties=new Properties();
		try {
			obj_Properties.load(obj_FileinpuFileInputStream);
		} catch (IOException e) {
			System.out.println(e);
		}
		return obj_Properties;
	}

}
