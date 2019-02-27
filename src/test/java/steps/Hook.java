package steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Created by Karthik on 31/01/2019.
 */

public class Hook extends BaseUtil{

public  WebDriver driver;
    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(Scenario scenario) {

System.out.println("111111111111");
        //scenarioDef = base.features.createNode(scenario.getName());
System.out.println("22222222");
        System.out.println("Opening the browser : Firefox");

        /*System.setProperty("webdriver.firefox.marionette", "D:\\Libs\\geckodriver.exe");
        base.Driver = new FirefoxDriver();*/


        //Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:/Libs/chromedriver.exe");
        System.out.println("3333333333333");
        base.Driver = new ChromeDriver();
        System.out.println("44444444444");
        
        
        System.out.println("55555");
        System.setProperty("webdriver.chrome.driver", "C:/Libs/chromedriver.exe);
System.out.println("66666");
                    driver = new ChromeDriver();
System.out.println("7777");
                    driver.manage().window().maximize();
        System.out.println("888888");
    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }

}
