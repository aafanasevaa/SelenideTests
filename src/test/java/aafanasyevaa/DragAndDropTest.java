package aafanasyevaa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void DragAndDropTest() {

//        - Открыть https://the-internet.herokuapp.com/drag_and_drop
        open ("https://the-internet.herokuapp.com/drag_and_drop");

//        - Перенести прямоугольник А на место В
        $("#column-a").dragAndDropTo($("#column-b"));

//        - Проверить, что прямоугольники действительно поменялись
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));

    }
}
