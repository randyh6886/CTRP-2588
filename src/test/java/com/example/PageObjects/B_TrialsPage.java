package com.example.PageObjects;

import com.example.Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class B_TrialsPage extends BaseClass {
    public static WebDriver weBdriver;

    public B_TrialsPage(WebDriver ldriver) {
        this.weBdriver=ldriver;
        PageFactory.initElements(ldriver,this);
    }
    public void clickTrialsMenuOption(){
        B_TrialsPage.weBdriver.findElement(By.id("trialSearchMenuOption")).click();

    }
    public void clickIdentifier(){
        WebElement element=weBdriver.findElement(By.id("identifier"));
        element.click();
    }
    public void enterTextInIdentifierBox(){
        WebElement element=weBdriver.findElement(By.id("identifier"));
        element.sendKeys("NCI-2017");
    }
    public void typeAmendmentIntoSearchBySubmission(){
        WebElement element=weBdriver.findElement(By.cssSelector("tr:nth-child(7) .select2-search__field"));
        element.click();
        element.sendKeys("Amendment");
    }
    public void clickSearch(){
        WebElement element=weBdriver.findElement(By.cssSelector(".search"));
        element.click();
    }
    public void assertStep(){
        String assertText="Search Results!!!!";
        System.out.println(weBdriver.findElement(By.cssSelector("h2")).getText());
        Assert.assertTrue(assertText.equals(weBdriver.findElement(By.cssSelector("h2")).getText()));
    }
}

