package com.PHP.library;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import org.apache.log4j.Logger;

public class JavaPropManager {
	final static Logger logger = Logger.getLogger(JavaPropManager.class);
	private String propertiesFile;
	private Properties prop;
	private OutputStream output;
	private InputStream input;

	public JavaPropManager(String propertiesFilePath) {
		propertiesFile = propertiesFilePath;
		prop = new Properties();
	}

	public String readProperty(String key) {
		String value = null;
		try {
			input = new FileInputStream(propertiesFile);
			prop.load(input);
			value = prop.getProperty(key);
		} catch (Exception e) {
			logger.error("Error: ", e);
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (Exception e) {
					logger.error("Error: ", e);
				}
			}
		}
		return value;
	}

	public void setProperty(String key, String value) {
		try {
			output = new FileOutputStream(propertiesFile);
			prop.setProperty(key, value);
			prop.store(output, null);
		} catch (Exception e) {
			logger.error("Error: ", e);
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (Exception e) {
					logger.error("Error: ", e);
				}
			}
		}
	}

	public static void main(String[] args) {
//Set Properties
//		JavaPropManager jpm = new JavaPropManager("src/test/resources/config.properties");
//		jpm.setProperty("browserType", "chrome");
		JavaPropManager jpm = new JavaPropManager("src/test/resources/config.properties");
		String result = jpm.readProperty("browserType");
		logger.info("property value is: " + result);
	}
}