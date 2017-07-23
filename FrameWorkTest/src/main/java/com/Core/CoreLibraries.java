package com.Core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.Capabilities.ChromeCapabilities;
import com.constants.Constants;
import com.Core.Utilities;
public class CoreLibraries {
	

		private static ThreadLocal<WebDriver> localThread = new ThreadLocal();
		static Utilities utils;
		private static String testDataFileName;
		public static String browserName;
		public static String testUrl;
		public static String isProxyEnabled;
		public static String platformType;
		public static String platformVersion;
		public static String isEmulator;
		public static String isNativeApp;
		public static String deviceName;
		public static String platformName;
		public static String appiumVersion;
		public static String app;


		public static WebDriver getDriver() {
			return (WebDriver) localThread.get();
		}


		public static String getConfig(String configName) {
			String configValue = "";

			try {
				configValue = utils.getProperty(Constants.configFileName, configName);
			} catch (Exception arg2) {
				arg2.printStackTrace();
			}

			return configValue;
		}
		protected WebDriver createInstance(String enableGrid) {
			try {
				WebDriver e = null;
				DesiredCapabilities capabilities = null;
				System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
				if (browserName.toLowerCase().contains("chrome")) {
					capabilities = ChromeCapabilities.createChromeCapability();

					e = new ChromeDriver(capabilities);
					((WebDriver) e).manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
				}

				localThread.set(e);
			} catch (Exception arg8) {
				arg8.printStackTrace();
			}

			return (WebDriver) localThread.get();
		}




		static {

			utils = new Utilities();
			testDataFileName = System.getProperty("testDataFile", getConfig("testDataFile"));
			browserName = System.getProperty("browserName", getConfig("browserName"));
			testUrl = System.getProperty("testUrl", getConfig("testUrl"));
			isProxyEnabled = System.getProperty("enableProxy", getConfig("isProxyEnabled"));
			platformType = System.getProperty("platformType", getConfig("platformType"));
			platformVersion = System.getProperty("platformVersion", getConfig("platformVersion"));
			isNativeApp = System.getProperty("isNativeApp", getConfig("isNativeApp"));
			deviceName = System.getProperty("deviceName", getConfig("deviceName"));
			platformName = System.getProperty("platformName", getConfig("platformName"));


		}


}
