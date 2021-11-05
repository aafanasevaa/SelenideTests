package aafanasyevaa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GitHubTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void FindJUnitInSelenide() {

//        - Откройте страницу Selenide в Github
        open ("https://github.com/selenide/selenide");

//        - Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();

//        - Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".mx-auto").click();
        $(".Layout-sidebar").find(byText("SoftAssertions")).click();

//          - Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5

        $(".repository-content").shouldHave(text("com.codeborne.selenide.junit5.SoftAssertsExtension"));
    }
}
