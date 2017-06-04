package com.constants;


public class Constants {
	

		private static final String ctmHomeDir =  "F:/CTM_Automation";
		public static final int ELEMENT_WAIT_TIME = 20;
		public static final String passText = "PASS: ";
		public static final String failText = "FAIL: ";
		public static final String verificationHighlightColor = "magenta";
		//public static final String imagesDirectory;
		public static final String chromeDriverPath = "F:/CTM_Automation/browserWebDrivers/chromedriver/tools/chromedriver_win32chromedriver.exe";
		public static final String ieDriverPath = "/Automation/tools/IEDriverServer_Win32_2.45.0/IEDriverServer.exe";
		public static final String firefoxVersion = "33";
		public static final String versionMismatchAction = "warn";
		//public static final String screenshotFilePath;
		public static final String configFileName;
		public static final String gridHub = System.getProperty("gridURL",
				"http://SAx7nLkcZ0JCWZj6VHa8RTKX9Umh1SIK:i6HwHSzxJ8ZvY8sJFtInciab3niV5Rve@OD.gridlastic.com:80/wd/hub");
		//public static final String reportDirectory;
		//	public static final String archieveDirectory;
		//public static final String reportFileName = "CTM_LocalReport.html";
		//public static final String cssFile = "./resources/table.css";
		//public static final String mobileAppPath;

		static {
			//imagesDirectory = ctmHomeDir + "/mediacontent/screenshots";
			//screenshotFilePath = ctmHomeDir + "/mediacontent/screenshots/";
			configFileName = ctmHomeDir + "/config/config.properties";
			//reportDirectory = ctmHomeDir + "/localreport/";
			//archieveDirectory = ctmHomeDir + "/localreport/archive/";
			//mobileAppPath = ctmHomeDir + "/tools/";
		}


	}


