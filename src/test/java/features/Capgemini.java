package features;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.junit.Assert.assertEquals;

public class Capgemini {

    WebDriver driver;

    @Then("^Open page$")
    public void openPage() throws Throwable {
        System.setProperty("webdriver.ie.driver","src/test/resources/IEDriverServer.exe");
        DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
        //cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
        cap.setCapability(InternetExplorerDriver.ELEMENT_SCROLL_BEHAVIOR,true);
        cap.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS,true);
        cap.setCapability(InternetExplorerDriver.UNEXPECTED_ALERT_BEHAVIOR,true);
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @Then("^Click on link$")
    public void clickOnLink() throws Throwable {
        Thread.sleep(15000);
        driver.findElement(By.xpath(".//a[text()='Customer Service']")).click();
        //driver.findElement(By.xpath(".//a")).click();
        Thread.sleep(15000);
        assertEquals("Not matching","Hello. What can we help you with?",driver.findElement(By.xpath(".//h1[1]")).getText().trim());
    }

}
