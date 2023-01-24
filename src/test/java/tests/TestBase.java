package tests;

import com.codeborne.selenide.Configuration;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.MainPage;
import pages.StoresPage;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class TestBase {
    MainPage mainPage=new MainPage();
    StoresPage storesPage=new StoresPage();
    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = true;
        Configuration.browser=System.getProperty("browser","chrome");
        Configuration.browserVersion=System.getProperty("browserVersion","100.0");
        Configuration.browserSize = System.getProperty("browserSize","1920x1080");

        Configuration.baseUrl = "https://jmart.kz";

        Configuration.remote = System.getProperty("selenoidUrl","https://user1:1234@selenoid.autotests.cloud")+"/wd/hub";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
