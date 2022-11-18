package pageObject;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class CatalogPage {
    public static final String ALL_CATALOG_NAVIGATION_CLASSIFIER_LINK =
            "//span[@class='catalog-navigation-classifier__item-title']//*[normalize-space(text())]";
    public static final String CATALOG_NAVIGATION_LIST_COMPUTERS_AND_NETS = "//div[@data-id = '2']//div[@class =" +
            " 'catalog-navigation-list__aside-item']/div[normalize-space(text())]";

    public static final String CATALOG_NAVIGATION_CLASSIFIER_LINK_PATTERN =
            "//*[contains(@class, 'catalog-navigation-classifier__item')]//*[contains(text(), '%s')]";
    // "*[contains(@class, 'catalog-navigation-classifier__item')]//*[contains(text(),
    // '%s' and contains(text(), '%s'))]"; - так не кликает
    //"//li[.//span[contains(text(), '%s')]]";

    public static final String CATALOG_NAVIGATION_LIST_PATTERN =
            // "//div[@class='catalog-navigation-list__aside catalog-navigation-list__aside_active'][.//div[text() = '%s']]";
            "//*[@class='catalog-navigation-list__aside-title' and contains(text(), '%s')]";
    public static final String LIST_OF_PRODUCTS_FROM_CATEGORY =
            "//div[@class='catalog-navigation-list__aside-item catalog-navigation-list__aside-item_active']" +
                    "//span[@class='catalog-navigation-list__dropdown-data']";

    public CatalogPage assertCatalogNavigation() {
       $$x((format(ALL_CATALOG_NAVIGATION_CLASSIFIER_LINK))).shouldHave(size(10), ofSeconds(10));
        List<String>texts = $$x((format(ALL_CATALOG_NAVIGATION_CLASSIFIER_LINK))).shouldHave(size(10), ofSeconds(10)).texts();
        System.out.println(texts);
         return this;
    }

}
