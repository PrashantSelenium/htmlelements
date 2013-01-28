package ru.yandex.qatools.htmlelements.samples.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;
import ru.yandex.qatools.htmlelements.samples.elements.SearchArrow;

/**
 * User: eroshenkoam
 * Date: 1/24/13, 4:53 PM
 */
public class SearchPage {

    @FindBy(className = "b-search__table")
    protected SearchArrow searchArrow;

    public SearchPage(WebDriver driver) {
        HtmlElementLoader.populate(this, driver);
    }

    public SearchArrow getSearchArrow() {
        return searchArrow;
    }

}