package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumExample {
    private SeleniumConfig config;
    private String url = "https://accounts.google.com";


    SeleniumExample(){
        config = new SeleniumConfig();
        config.getDriver().get(url);

    }

    public void closeWindow() {
        this.config.getDriver().close();
    }

    public String getTitle(){
        return this.config.getDriver().getTitle();
    }

    public void writeSentenceInSearchBox(){
        WebElement textArea = (WebElement) this.config.getDriver().findElement(By.cssSelector("input#identifierId"));
        textArea.sendKeys("test2@gmail.com");

        WebElement button = this.config.getDriver().findElement(By.cssSelector(".VfPpkd-RLmnJb"));
        button.click();
    }
}
