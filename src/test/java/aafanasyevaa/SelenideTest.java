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

//        - Открыть страницу Selenide в Github
        open ("https://github.com/selenide/selenide");

//        - Перейти в раздел Wiki проекта
        $("#wiki-tab").click();

//        - Убедиться, что в списке страниц (Pages) есть страница SoftAssertions
        $(".mx-auto").click();
        $(".Layout-sidebar").find(byText("SoftAssertions")).click();

//        - Открыть страницу SoftAssertions, проверить что внутри есть пример кода для JUnit5

        $(".repository-content").shouldHave(text("com.codeborne.selenide.junit5.SoftAssertsExtension"));
    }
}
