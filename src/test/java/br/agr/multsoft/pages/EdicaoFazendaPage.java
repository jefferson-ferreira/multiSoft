package br.agr.multsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.agr.multsoft.driver.GenericPage;

public class EdicaoFazendaPage extends GenericPage {
    private WebDriver driver;

    public EdicaoFazendaPage(WebDriver driver) {
        this.driver = driver;
    }

    public EdicaoFazendaPage menuEntradaAnimais() throws InterruptedException {
        Thread.sleep(9000);
        driver.findElement(By.xpath("//*[@ng-click='acaoAbrirMenu()']")).click();

        return this;
    }

    public EdicaoFazendaPage campoPesquisa(String valor) throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(By.cssSelector("#pesquisa_menu")).sendKeys(valor);;

        return this;
    }

    public ListaEntradaAnimaisPage clickValorPesquisa(String valor) throws Exception {
        clicarItemLista(driver.findElement(By.cssSelector(".nav-panel.click-menu")), valor);

        return new ListaEntradaAnimaisPage(driver);
    }
}