import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import pageObject.OnlinerHeader;

import static com.codeborne.selenide.Selenide.open;

public class NavigationTest {
    @BeforeAll
    public static void setupBrowser() {
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().setup();

    }

    @Test
    public void testPageNavigation(){
        new OnlinerHeader().navigateToOnliner()
                .clickOnOnlinerCatalogLink("Каталог")
                .assertCatalogNavigation();


    }
}
