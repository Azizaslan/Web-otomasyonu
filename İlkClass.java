package Casestudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class İlkClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.setur.com.tr/");
        driver.manage().window().maximize();

        WebElement nereyeGideceksiniz = driver.findElement(By.cssSelector(".sc-24cfb4e8-0[placeholder=\"Otel Adı Veya Konum\""));
        nereyeGideceksiniz.click();
        nereyeGideceksiniz.sendKeys("Antalya");

        WebElement antalyaButton = driver.findElement(By.className(".sc-94dcce44-4 gbIFJb//div[1"));
        antalyaButton.click();
        WebElement neKadarKalacaksınız = driver.findElement(By.className(".sc-94dcce44-4gbIFJb//div[1"));
        neKadarKalacaksınız.click();
        WebElement rightButton = driver.findElement(By.className(".sc-fd984615-0"));
        rightButton.click();
        rightButton.click();
        rightButton.click();

        WebElement monday = driver.findElement(By.xpath("//td[@aria-label='Selected as start date. Pazartesi, 1 Nisan 2024']//span[@class='sc-1720695c-0 kNqhKR'][normalize-space()='1']"));
        monday.click();
        WebElement sunday = driver.findElement(By.xpath("//td[@aria-label='Selected as end date. Pazar, 7 Nisan 2024']//span[@class='sc-1720695c-0 kNqhKR'][normalize-space()='7']"));
        sunday.click();

        WebElement kaçKişiKonaklayacaksınız = driver.findElement(By.cssSelector(".sc-b2c3f6ee-21.bSPwxV"));
        kaçKişiKonaklayacaksınız.click();
        WebElement artış = driver.findElement(By.xpath("//div[@class='sc-b2c3f6ee-14 dirCeL']//div[1]//div[1]//div[2]//button[2]//span[1]//span[1]//*[name()='svg']"));
        artış.click();

        WebElement ara = driver.findElement(By.cssSelector("button[type='button']"));
        ara.click();

        WebElement diğerbölgelerigöster = driver.findElement(By.xpath("//div[@class='sc-6a38e3d8-2 nBURe']//*[name()='svg']"));
        diğerbölgelerigöster.click();

        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,5000)","");

        driver.quit();


    }
}
