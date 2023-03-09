package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;
import static main.BasePage.attachScreenshot;

public class ItemPage {
    //    public String getTitleText = "";
    private static final SelenideElement OpenThisPage = $x("//h1[@data-qa='vacancy-title']");


    @Step("Проверка корректности открытия страницы")
    public ItemPage openThisPage() {
        OpenThisPage.getText();
        attachScreenshot();
        return this;
    }
}
