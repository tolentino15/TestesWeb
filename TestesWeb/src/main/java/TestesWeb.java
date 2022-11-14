import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;


public class TestesWeb {

@Test
public void  testeBuscaKabum() {
    
    System.setProperty("webdriver.chrome.driver", "caminho do webdriver");
    WebDriver navegador = new ChromeDriver();

    navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    navegador.get("https://www.kabum.com.br/");

    navegador.findElement(By.id("input-busca")).sendKeys("ps5");
    navegador.findElement(By.id("input-busca")).submit(); // teste Selenium = ok!
    String url = navegador.getCurrentUrl();

    Assert.assertEquals("https://www.kabum.com.br/gamer/playstation/consoles-playstation/playstation-5", url);
    // teste JUnit = ok!
}

@Test
public void  testeErrorLoginKabum() {
    
    System.setProperty("webdriver.chrome.driver", "caminho do webdriver");
    WebDriver navegador = new ChromeDriver();

    navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    navegador.get("https://www.kabum.com.br/");

    navegador.findElement(By.id("menuHamburguer")).click();
    navegador.findElement(By.className("sc-ksZaOG sc-hAZoDl jWJOrz iBnPGs")).click(); // teste Selenium = ok!
    navegador.findElement(By.className("IconLoginButton")).click();
    
    
    WebElement mensagemErro = navegador.findElement(By.className("sc-fnGiBr zSKVC"));

    Assert.assertEquals(navegador.findElement(By.className("sc-fnGiBr zSKVC")), mensagemErro);
    // teste JUnit = ok!
}

@Test
public void  testeInstagramKabum() {
    
    System.setProperty("webdriver.chrome.driver", "caminho do webdriver");
    WebDriver navegador = new ChromeDriver();

    navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    navegador.get("https://www.kabum.com.br/");

    navegador.findElement(By.className("IconFooterInstagram")).click(); // teste Selenium = ok!
    String url = navegador.getCurrentUrl();

    Assert.assertEquals("https://www.instagram.com/kabum.com.br/", url);
    // teste JUnit = ok!
}
}
