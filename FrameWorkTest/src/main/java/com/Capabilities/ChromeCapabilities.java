package com.Capabilities;

import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.constants.Constants;
public class ChromeCapabilities {
	public static DesiredCapabilities createChromeCapability() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.VISTA);
		capabilities.setCapability("video", "True");
		capabilities.setCapability("chrome.switches", Arrays.asList(new String[] { "--no-default-browser-check" }));
		capabilities.setCapability("unexpectedAlertBehaviour", UnexpectedAlertBehaviour.ACCEPT);
		HashMap chromePreferences = new HashMap();
		chromePreferences.put("profile.password_manager_enabled", "false");
		capabilities.setBrowserName("chrome");
		if (Constants.gridHub.contains("localhost")) {
			System.setProperty("webdriver.chrome.driver", "F:/CTM_Automation/browserWebDrivers/chromedriver/tools/chromedriver_win32/chromedriver.exe");
		}

		System.setProperty("webdriver.chrome.driver", "F:/CTM_Automation/browserWebDrivers/chromedriver/tools/chromedriver_win32/chromedriver.exe");
		capabilities.setCapability("chrome.prefs", chromePreferences);
		return capabilities;
	}

}
