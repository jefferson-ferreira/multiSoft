package br.agr.multsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.agr.multsoft.driver.GenericPage;

public class LoginPage extends GenericPage{

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage informarEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);

        return this;
    }

        public LoginPage informarSenha(String senha) {
        driver.findElement(By.id("password")).sendKeys(senha);

        return this;
    }

    public RecuperarSenhaPage acessarPageRecuperarSenha() {
        driver.findElement(By.xpath("//*[@ui-sref='recuperar-senha']")).click();

        return new RecuperarSenhaPage(driver);
    }

        public ListaFazendasPage acessarPageListaFazendas() {
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        return new ListaFazendasPage(driver);
    }
}
