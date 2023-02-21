import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {
    WebDriver wd;//это поле (его нужно инецелизировать)

    @BeforeMethod
    public void preCondition() {
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
        //   wd.get("https://telranedu.web.app/home");//go wed-site только 1 раз
        wd.navigate().to("https://telranedu.web.app/home");

    }

    @Test
    public void testLogin() {
        WebElement element = wd.findElement(By.tagName("a"));
        List<WebElement> list = wd.findElements(By.tagName("a"));//dженерик
        System.out.println(list.size());
    }

    @AfterMethod
    public void postCondition() {
        //wd.close();//вкладку к моменту вызова метода
     //   wd.quit();//закрывает все вкладки

    }

}
