package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PesquisaPage {

    protected  WebDriver driver;

    public PesquisaPage(WebDriver driver) {
       this.driver = driver;
    }

    public void openPage(String url){
        driver.get(url);
    }

    public String getTitleName(){
        String titulo = driver.getTitle();
        return titulo;
    }

    public WebElement setCampo(String termo, By campo){
        WebElement pesquisaInput = driver.findElement(campo);
        pesquisaInput.sendKeys(termo);
        return  pesquisaInput;
    }

    public void closePage(){
        driver.close();
    }
}
