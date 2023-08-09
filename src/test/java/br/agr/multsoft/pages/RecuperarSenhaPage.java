package br.agr.multsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.agr.multsoft.driver.GenericPage;

public class RecuperarSenhaPage extends GenericPage{

    private WebDriver driver;

    public RecuperarSenhaPage(WebDriver driver) {
        this.driver = driver;
    }

    public RecuperarSenhaPage informarEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);

        return this;
    }
    
    public RecuperarSenhaPage accessCustomerRegistrationForm() {
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        return this;
    }

        public LoginPage acessarPageLogin() {
        driver.findElement(By.xpath("//*[@ui-sref='login']")).click();

        return new LoginPage(driver);
    }
//Um e-mail foi enviado com instruções para prosseguir com o alteração da senha
    public String captureDisplayedMessage() {
        return driver.findElement(By.cssSelector("div.ui-notification.ng-scope.success.clickable > div")).getText();
    }
}
