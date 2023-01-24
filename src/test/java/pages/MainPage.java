package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import pages.components.CitySelectModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    CitySelectModal citySelectModal=new CitySelectModal();

    SelenideElement
            selectedCity=$x("//div[@class='sc-kDTinF fNpZc']");

    ElementsCollection
            mainMenus = $$x(".//div[@class='sc-gKclnd sc-iqseJM eAsfZL gHYMmw sc-cabOPr JiVmU']//a");

    public MainPage mainMenusSelectThird() {
        mainMenus.get(2).click();
        return this;
    }

    public MainPage selectCity(String cityName){
        citySelectModal.citySelectAndClick(cityName);
        return this;
    }

    public MainPage openCitySelectModal(){
        selectedCity.click();
        return this;
    }

    public MainPage checkCityNameOnMainPage(String city){
        selectedCity.shouldHave(text(city));
        return this;
    }

}
