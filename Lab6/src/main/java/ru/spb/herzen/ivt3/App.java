package ru.spb.herzen.ivt3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App
{
    public static void main( String[] args )
    {
        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://www.herzen.spb.ru/alumni");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.OFF);



        WebElement element;
        try {
            element = driver.findElement(By.className("news_header_link"));
            System.out.println("Element seems to be found.");

            System.out.println("URL before: " + driver.getCurrentUrl() + ".");

            element.click();
            System.out.println();

            System.out.println("URL after: " + driver.getCurrentUrl() + ".");
        } catch(Exception e){
            System.out.println("Null");
        }

        driver.quit();
    }
}

