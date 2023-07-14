package com.ebay.tests;


import com.ebay.fw.AppManager;
import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBase {

    protected static  AppManager app = new AppManager
            (System.getProperty("browser", Browser.CHROME.browserName()));

    Logger logger = LoggerFactory.getLogger(TestBase.class);


    // @BeforeMethod
    @BeforeSuite
    public void setUp() {
        app.init();
    }

    // @AfterMethod(enabled = false)
    @AfterSuite(enabled = true)
    public void tearDown() {
        app.stop();
    }


}