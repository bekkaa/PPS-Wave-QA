package com.waveAutomation.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static void sleep(int second){
        second *= 1000;
        try{
            Thread.sleep(second);
        }catch (InterruptedException e){
            System.out.println("something happened in sleep method");
        }
    }

    public static List<String> getElementText (List<WebElement> webElementList) {

        List<String> webElementAsString = new ArrayList<>();

        for (WebElement each : webElementList ) {

            webElementAsString.add(each.getText());

        }

        return webElementAsString;
    }

    public static void titleVerification(String expectedTitle){

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }


}
