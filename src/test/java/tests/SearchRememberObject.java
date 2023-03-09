package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.Test;
import pages.Search;

public class SearchRememberObject {
    private static String SITE_URL = System.getProperty ("site_url", "https://spb.hh.ru/");
    private static String Title = "title";

    @Epic(value = "Поиск")
    @Test
//    @Tag("smoke")
    @Description(value = "Поиск телефона")
    public void searchRememberObject(){
        new Search().siteUrl(SITE_URL)
                .inputSearchField("QA")
                .getTitleValue()
                .timePeriod()
                .timePeriodDay()
                .getSearchItem()
                .openThisElement()
                .openThisPage();

//       Assertions.assertEquals(new Search().getTitleValue(), new ItemPage().openThisPage());
    }
}
