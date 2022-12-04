package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class StoresPage {
    SelenideElement
            cityOfStores=$x("//span[@class='sc-kDTinF kPWtmW']");

    ElementsCollection
            storeNameElements=$$x("//h2[@class='sc-kDTinF hlekWu']");

    public StoresPage checkSelectedCity(String city){
        cityOfStores.shouldHave(text(city));
        return this;
    }

    public void checkStoresNames(List<String> storeNames){
        storeNameElements.shouldHave(CollectionCondition.texts(storeNames));
    }

}
