package main;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    public static void goTo(){
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = System.getProperty("browser_size", "1920x1080");
        Configuration.browser = System.getProperty("browser","chrome");
        SelenideLogger.addListener("AllureSelenide",
                new AllureSelenide());
    }
}
