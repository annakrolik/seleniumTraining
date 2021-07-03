package com.sda.training.test;

import com.sda.training.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;

public class GoogleSearchTest extends WebDriverManager {

    @Before
    public void setUp() throws Exception {
        startDriver();
        DRIVER.get("http://www.google.com");

        WebElement agreeButton = DRIVER.findElement(By.id("L2AGLb"));
        agreeButton.click();
    }

    @After
    public void tearDown() throws Exception {
        destroyDriver();
    }

    @Test
    public void testSearchSomethingInGoogle() throws InterruptedException {
        WebElement searchField =DRIVER.findElement(By.name("q"));
        searchField.sendKeys("SDA Academy");
        searchField.sendKeys(Keys.ENTER);

        WebElement searchStats = DRIVER.findElement(By.id("result-stats"));
        assertThat("Search stats should be displayed, but there is some issue", searchStats.isDisplayed());

        WebDriverWait wait = new WebDriverWait(DRIVER, 10);
        WebElement searchResultsList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rcnt")));

        assertThat("Search stats should be displayed, but there is some issue", searchStats.isDisplayed());
    }


}
