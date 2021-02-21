package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class SeleniumConfig {
        private WebDriver driver;

        static {
            System.setProperty("webdriver.gecko.driver", "/Users/bieły/IdeaProjects/Web_Drivers/geckodriver.exe");
        }

        public SeleniumConfig(){
            driver = new FirefoxDriver();
            driver.manage()
                    .timeouts()
                    .implicitlyWait(10, TimeUnit.SECONDS);
        }

        public WebDriver getDriver() {
            return driver;
        }
    }

