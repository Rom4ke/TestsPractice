package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class Search {
    public String newElement = "";

    private static final SelenideElement InputSearchField = $x("//input[@data-qa='search-input']");
    private static final SelenideElement GetTitleValue = $x("//a[@data-qa='serp-item__title'][1]");
    private static final SelenideElement TimePeriod = $x("//*[contains(text(),'время')]/..");
    private static final SelenideElement TimePeriodDay = $x("//div[@data-qa='order-by-1']");
    private static final SelenideElement OpenThisElement = $x("//a[@data-qa='serp-item__title'][1]");


    @Step("Открыть сайт")
    public Search siteUrl(String SITE_URL){
        open(SITE_URL);
        return this;
    }
    @Step("Поиск")
    public Search inputSearchField(String value) {
        InputSearchField.setValue(value).sendKeys(Keys.ENTER);
        return this;
    }

    @Step("Запоминаем первый элемент в списке {value}")
    public Search getTitleValue() {
        String newElement = GetTitleValue.getText();
        return this;
    }

    @Step("Клик по фильтру временной период")
    public Search timePeriod() {
        TimePeriod.click();
        return this;
    }

    @Step("Выбор периода")
    public Search timePeriodDay() {
        TimePeriodDay.click();
        return this;
    }

    @Step("Ввод данных в поисковую строку")
    public Search getSearchItem() {
        InputSearchField.setValue(newElement).sendKeys(Keys.ENTER);
        return this;
    }

    @Step("Открыть первый найденный элемент")
    public ItemPage openThisElement() {
        OpenThisElement.click();
        switchTo().window(1);
        return new ItemPage();
    }
}
