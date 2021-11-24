package aafanasyevaa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void FindJUnitInSelenide() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".mx-auto").click();
        $(".Layout-sidebar").find(byText("SoftAssertions")).click();
        $(".repository-content").shouldHave(text("com.codeborne.selenide.junit5.SoftAssertsExtension"));
    }
}
