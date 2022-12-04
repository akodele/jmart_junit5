package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.MainPage;
import pages.StoresPage;

import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;

public class TestBase {
    MainPage mainPage=new MainPage();
    StoresPage storesPage=new StoresPage();
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://jmart.kz";
    }
    @AfterEach
    public void clearCache() {
        clearBrowserCache();
    }
}
