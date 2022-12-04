package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.stream.Stream;

import static com.codeborne.selenide.Selenide.open;

public class CityProductsStoreTest extends TestBase {

    @ValueSource(strings = {"Алматы","Астана"})
    @ParameterizedTest(name = "Проверка отображения выбранного города {0} на странице продуктовых магазинов маркетплейса JMart")

    public void selectedCityOnStorePageTest(String city) {
        open("/");
        mainPage.
                selectCity(city).
                mainMenusSelectThird();
        storesPage.
                checkSelectedCity(city);

    }

    static Stream<Arguments> storesOfCityTest() {
        return Stream.of(
                Arguments.of("Алматы", List.of("A-Store", "Bahcha", "Carefood",
                                            "Cадыхан", "Flamingo", "Moonyalmaty",
                                            "Mясной Boszhan", "Oвощной", "Riza Herb",
                                            "Small", "Tvoy.kz", "Zоомагазин ZOOKORM",
                                            "Zоомагазин Zoo KING", "Zоомагазин Котопёс", "АLCOMARKET",
                                            "Аптека SMART", "Ароматный мир", "Бады Alhadaya",
                                            "Бады DoroMarine", "Дәмді ет", "Еlitalco",
                                            "Кондитерская Caramel", "Кофе Accio Store", "Мfood.kz",
                                            "Мy Mart", "Магазин XO", "Продукция Цесна",
                                            "Шымбулак Water")),
                Arguments.of("Астана", List.of("Aстыкжан", "JIDEK.KZ", "KazZooMir",
                                            "Mясная лавка №1", "Tvoy.kz (Астана)",
                                            "Кофе Accio Store"))
        );
    }

    @MethodSource
    @ParameterizedTest(name = "Проверка наличия продуктовых магазинов из списка {1} на сайте JMart в городе {0}")

    public void storesOfCityTest(String city, List<String> storeNames) {
        open("/");
        mainPage.
                selectCity(city).
                mainMenusSelectThird();
        storesPage.
                checkSelectedCity(city).
                checkStoresNames(storeNames);

    }

    @CsvFileSource(resources = "/cities.csv",delimiter = ';')
    @ParameterizedTest(name = "Проверка отображения выбранного города {0} на главной странице маркетплейса JMart")

    public void selectedCityOnMainPageTest(String city) {
        open("/");
        mainPage.
                selectCity(city).
                checkCityNameOnMainPage(city);

    }



}
