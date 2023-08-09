package br.agr.multsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListaEntradaAnimaisPage {
    private WebDriver driver;

    public ListaEntradaAnimaisPage(WebDriver driver) {
        this.driver = driver;
    }

      public IncluirAnimalPage incluirAnimal() {
        driver.findElement(By.xpath("//*[@ng-click='vm.novaEntidade()']")).click();

        return new IncluirAnimalPage(driver);
    }
}
