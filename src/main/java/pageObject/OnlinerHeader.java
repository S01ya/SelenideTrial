package pageObject;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import framework.BasePage;

public class OnlinerHeader extends BasePage {
    private static final String ONLINER_URL ="https://www.onliner.by/";
    private static final String MAIN_NAVIGATION_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'main-navigation__text') and contains(text(), '%s')]";

     public OnlinerHeader navigateToOnliner() {
         open(ONLINER_URL);
         return this;
     }
    public CatalogPage clickOnOnlinerCatalogLink(String link) {
        $x(format(format(MAIN_NAVIGATION_LINK_XPATH_PATTERN, link)))
                .shouldBe(visible, ofSeconds(10)).click();
        return new CatalogPage();

    }


}
