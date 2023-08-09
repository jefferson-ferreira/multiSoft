package br.agr.multsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.agr.multsoft.driver.GenericPage;

public class ListaFazendasPage extends GenericPage {

    private WebDriver driver;

    public ListaFazendasPage(WebDriver driver) {
        this.driver = driver;
    }

    public ListaFazendasPage informarCampoPesquisa(String pesquisa) throws Exception {
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#filtro_search_keyword")).sendKeys(pesquisa);

        return this;
    }

    public EdicaoFazendaPage clicarFazendaGrid(String valor) throws Exception {
        Thread.sleep(3000);
        clicarGrid(driver.findElement(By.cssSelector(".table.table-hover.table-custom.ng-scope > tbody")), valor);

        return new EdicaoFazendaPage(driver);
    }
}
