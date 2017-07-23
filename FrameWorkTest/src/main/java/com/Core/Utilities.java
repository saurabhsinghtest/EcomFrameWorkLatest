package com.Core;

import java.io.FileInputStream;
import java.util.Properties;

public class Utilities {
	public String getProperty(String fileName, String propertyName) {
		Properties property = new Properties();
		FileInputStream input = null;
		String propertyValue = "";

		try {
			input = new FileInputStream(fileName);
			property.load(input);
			propertyValue = property.getProperty(propertyName);
		} catch (Exception arg6) {
			arg6.printStackTrace();
		}

		return propertyValue;
	}

}
