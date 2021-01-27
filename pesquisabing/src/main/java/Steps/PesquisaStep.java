package Steps;

import PageObjects.PesquisaPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class PesquisaStep {

    WebDriver driver = new ChromeDriver();
    PesquisaPage pesquisa = new PesquisaPage(driver);


    @Dado("que eu estou na página inicial do bing")
    public void que_eu_estou_na_página_inicial_do_bing() {
        pesquisa.openPage("https://www.bing.com");
        String title = pesquisa.getTitleName();
        assert(title.equals("Bing"));
    }

    @Quando("eu informo o termo")
    public void eu_informo_o_termo() {
        WebElement input =  pesquisa.setCampo("gifs de gatinhos", By.id("sb_form_q"));
    }

    @Quando("clico em ENTER")
    public void clico_em_ENTER() {
        driver.findElement(By.id("sb_form_q")).sendKeys(Keys.ENTER);
    }

    @Então("sou direcionado para o resultado da busca")
    public void sou_direcionado_para_o_resultado_da_busca() {
        String  pageResultTitle = driver.getTitle();
        assert(pageResultTitle.equals("gifs de gatinhos - Bing"));
    }

}
