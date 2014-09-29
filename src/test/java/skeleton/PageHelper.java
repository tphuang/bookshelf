package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageHelper {
    private static final int DELAY_SEAONDS = 40;
    private static final int ELEMENTS_DELAY_MILLIS = 300;
    public static final String LOCAL_URL = "http://localhost:8080/bookshelf/home";

    private WebDriver webDriver;
    private Map<String, String> descriptionToValueMap = new HashMap<String, String>();

    public PageHelper(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public PageHelper initPage(PageData pageData) {
        this.descriptionToValueMap.putAll(pageData.getElementDescription());
        return this;
    }

    public void getAppUrl() {
        webDriver.get(LOCAL_URL);
    }

    public String getElementValue(String description) {
        return descriptionToValueMap.get(description.trim());
    }

    public WebElement getElementByElementId(final String description) {
        try {
            Thread.sleep(ELEMENTS_DELAY_MILLIS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait driverWait = new WebDriverWait(webDriver, DELAY_SEAONDS);
        return driverWait.until(ExpectedConditions.elementToBeClickable(By.id(getElementValue(description))));
    }

    public WebElement getElementByXPath(String xpath) {
        try {
            Thread.sleep(ELEMENTS_DELAY_MILLIS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait driverWait = new WebDriverWait(webDriver, DELAY_SEAONDS);
        return driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(getElementValue(xpath))));
    }

    public WebElement getElementBylinkText(String linkText) {
        try {
            Thread.sleep(ELEMENTS_DELAY_MILLIS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait driverWait = new WebDriverWait(webDriver, DELAY_SEAONDS);
        return driverWait.until(ExpectedConditions.elementToBeClickable(By.linkText(linkText)));
    }

    public WebElement getElementByCssSelector(String selector) {
        try {
            Thread.sleep(ELEMENTS_DELAY_MILLIS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait driverWait = new WebDriverWait(webDriver, DELAY_SEAONDS);
        return driverWait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(getElementValue(selector))));
    }

    public List<WebElement> getElementsByCssSelector(String selector) {
        List<WebElement> list = webDriver.findElements(By.cssSelector(getElementValue(selector)));
        return list;
    }

    public WebElement getLastElementByCssSelector(String selector) {
        try {
            Thread.sleep(ELEMENTS_DELAY_MILLIS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> elements = getElementsByCssSelector(selector);
        return elements.get(elements.size() - 1);
    }

    public void fillInput(String content, String field) {
        WebElement webElement = getElementByElementId(field);
        webElement.clear();
        try {
            Thread.sleep(ELEMENTS_DELAY_MILLIS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        webElement.sendKeys(content);
    }

    public Boolean assertOnPage(String pageName) {
        try {
            Thread.sleep(ELEMENTS_DELAY_MILLIS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebDriverWait driverWait = new WebDriverWait(webDriver, DELAY_SEAONDS);
        return driverWait.until(ExpectedConditions.titleContains(pageName));
    }

}
