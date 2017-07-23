package com.Core;

public class FunctionLibraries extends CoreLibraries{
	private static String gridEnabledParam;
	Utilities utils = new Utilities();
	public void startBrowser() {
		try {
			

			this.createInstance(gridEnabledParam);
			if (CoreLibraries.platformType.equals("NA")) {
				getDriver().manage().window().maximize();
			}

			String e = "";
			
			getDriver().get(testUrl);
			//this.logReportAndFailIfNeeded(passText + "Starting " + this.getBrowserAndVersion());

		} catch (Exception arg1) {
			arg1.printStackTrace();
			//System.out.println(failText + "Unable to Start " + browserName + " browser");
		}
	}
}
