import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;//это поле (его нужно инецелизировать)

    @BeforeMethod
    public void preCondition(){
        System.out.println("Opening web-site");
    wd = new ChromeDriver();
    }
    @Test
    public void testLogin(){

    }
    @AfterMethod
    public void postCondition(){

    }

}
