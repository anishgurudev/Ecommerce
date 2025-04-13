package stepDefinations;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ExtentReportManager;

public class Hooks {

    @Before
    public void setup() {
        ExtentReportManager.startReport();
        BaseClass.initializeDriver();
    }

    @After
    public void teardown() {
        ExtentReportManager.endReport();
        BaseClass.quitDriver();
    }
}
