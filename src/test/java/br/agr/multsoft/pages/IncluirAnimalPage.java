package br.agr.multsoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import br.agr.multsoft.driver.GenericPage;

public class IncluirAnimalPage extends GenericPage {
    private WebDriver driver;

    public IncluirAnimalPage(WebDriver driver) {
        this.driver = driver;
    }

    public IncluirAnimalPage documentoAuto() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@ng-model='vm.model.documento_auto']")).click();

        return this;
    }

    public IncluirAnimalPage sexo(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@ng-model='vm.model.sexo']/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@ng-model='vm.model.sexo']/div/div/input")).sendKeys(valor);
        Thread.sleep(1000);
        combo(driver.findElement(By.xpath("//*[@id='vm.model.sexo']/div[2]/div/div/div[2]")), valor);

        return this;
    }

    public IncluirAnimalPage raca(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@ng-model='vm.model.raca']/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@ng-model='vm.model.raca']/div/div/input")).sendKeys(valor);
        Thread.sleep(1000);
        combo(driver.findElement(By.xpath("//*[@ng-model='vm.model.raca']/div/div[2]/div/div/div[2]")), valor);

        return this;
    }

    public IncluirAnimalPage grauSangue(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@ng-model='vm.model.grau_de_sangue']/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@ng-model='vm.model.grau_de_sangue']/div/div/input")).sendKeys(valor);
        Thread.sleep(1000);
        combo(driver.findElement(By.xpath("//*[@ng-model='vm.model.grau_de_sangue']/div/div[2]/div/div/div[2]")),
                valor);

        return this;
    }

    public IncluirAnimalPage tipoAnimal(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@ng-model='vm.model.tipo_animal']/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@ng-model='vm.model.tipo_animal']/div/div/input")).sendKeys(valor);
        Thread.sleep(1000);
        combo(driver.findElement(By.xpath("//*[@ng-model='vm.model.tipo_animal']/div/div[2]/div/div/div[2]")),
                valor);

        return this;
    }

    public IncluirAnimalPage tipoEntrada(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@ng-model='vm.model.tipo']/div[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@ng-model='vm.model.tipo']/div/div/input")).sendKeys(valor);
        Thread.sleep(1000);
        combo(driver.findElement(By.xpath("//*[@ng-model='vm.model.tipo']/div/div[2]/div/div/div[2]")),
                valor);

        return this;
    }

    public IncluirAnimalPage dataAquisicao(String valor) throws Exception {
        driver.findElement(By.cssSelector("#vm_model_data_aquisicao")).sendKeys(valor);

        return this;
    }

    public IncluirAnimalPage fornecedor(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@ng-model='vm.model.fornecedor']/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@ng-model='vm.model.fornecedor']/div/div/input")).sendKeys(valor);
        Thread.sleep(1000);
        combo(driver.findElement(By.xpath("//*[@ng-model='vm.model.fornecedor']/div/div[2]/div/div/div[2]")),
                valor);

        return this;
    }

    public IncluirAnimalPage proprietario(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@ng-model='vm.model.proprietario']/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@ng-model='vm.model.proprietario']/div/div/input")).sendKeys(valor);
        Thread.sleep(1000);
        combo(driver.findElement(By.xpath("//*[@ng-model='vm.model.proprietario']/div/div[2]/div/div/div[3]")),
                valor);

        return this;
    }

    public IncluirAnimalPage pesoMedio(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@id='vm.model.peso_medio']")).sendKeys(valor);

        return this;
    }

    public IncluirAnimalPage loteEntrada(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@id='vm.model.lote']")).sendKeys(valor);

        return this;
    }

    public IncluirAnimalPage localAquisicao(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@id='vm.model.local_aquisicao']")).sendKeys(valor);

        return this;
    }

    public IncluirAnimalPage ordemCompra(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@id='vm.model.ordem_servico']")).sendKeys(valor);

        return this;
    }

    public IncluirAnimalPage idade(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@id='vm.model.idade']")).sendKeys(valor);

        return this;
    }

    public IncluirAnimalPage propriedadeOrigem(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@ng-model='vm.model.propriedade_fornecedor']/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@ng-model='vm.model.propriedade_fornecedor']/div/div/input")).sendKeys(valor);
        Thread.sleep(1000);
        combo(driver
                .findElement(By.xpath("//*[@ng-model='vm.model.propriedade_fornecedor']/div/div[2]/div/div/div[2]")),
                valor);

        return this;
    }

    public IncluirAnimalPage dataIdentificação(String valor) throws Exception {
        driver.findElement(By.xpath("//*[@ng-label='Data Identificação']/div/input")).sendKeys(valor);

        return this;
    }

    public IncluirAnimalPage buttonSalvar() throws Exception {
        driver.findElement(By.cssSelector(".btn.btn-default.btn-paginacao")).click();

        return this;
    }

    public String captureDisplayedMessage() throws InterruptedException {
        Thread.sleep(1000);
        return driver.findElement(By.cssSelector(".message.ng-binding")).getText();
    }
}
