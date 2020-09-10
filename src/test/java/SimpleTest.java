import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@Epic("Q.A. Guru automation course")
@Story("HW 12")
@Tag("Yandex")
public class SimpleTest {

    @Test
    @Description("Yandex test, we look for Selenide")
    @DisplayName("Succsessful search for selenide in yandex")
    void selenideSearchTest() {

        // Открыть google
        open("https://ya.ru");

        // Ввести Selenide в поиск
        $("#text").val("wikipedia").pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text("wikipedia.org"));
    }
}

