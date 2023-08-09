package br.agr.multsoft.driver;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import br.agr.multsoft.parameterization.ParametersUtils;

public class GenericPage {
    protected WebDriver driver;

    private static ParametersUtils parametersUtils = ConfigFactory.create(ParametersUtils.class);

    @BeforeEach
    public void initialize() {
        // Open browser
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        this.driver = new ChromeDriver();

        // Maximize browser
        this.driver.manage().window().maximize();

        // Navigate to application link
        this.driver.get(parametersUtils.url());

        // Set default wait time
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    public void clicarGrid(WebElement locateElement, String valor) throws Exception {
        try {
            boolean achou = false;
            for (int j = 0; j < 20; j++) {
                List<WebElement> gridItens = locateElement.findElements(By.tagName("tr"));
                for (WebElement itemGrid : gridItens) {
                    if (achou)
                        break;
                    List<WebElement> linhaGrid = itemGrid.findElements(By.tagName("td"));
                    for (int k = 0; k < (linhaGrid.size()); k++) {
                        if (valor.equals(linhaGrid.get(k).getText())) {
                            achou = true;
                            linhaGrid.get(k).click();
                            break;
                        }
                    }
                }
                if (achou)
                    break;
            }
            if (!achou) {
                throw new Exception("O registro -> " + valor + " <- não foi encontrado na lista.");
            }
        } catch (NoSuchElementException nsee) {
            throw new NoSuchElementException("Error ao obter o mapeamento do elemento");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void clicarItemLista(WebElement locateElement, String valor) throws Exception {
        try {
            boolean achou = false;
            for (int j = 0; j < 20; j++) {
                List<WebElement> listItens = locateElement.findElements(By.tagName("a"));
                for (int k = 0; k < (listItens.size()); k++) {
                    if (valor.equals(listItens.get(k).getText())) {
                        achou = true;
                        listItens.get(k).click();
                        break;
                    }
                }
                if (achou)
                    break;
            }
            if (!achou) {
                throw new Exception("O registro -> " + valor + " <- não foi encontrado na lista.");
            }
        } catch (NoSuchElementException nsee) {
            throw new NoSuchElementException("Error ao obter o mapeamento do elemento");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void combo(WebElement locateElement, String valor) throws Exception {
        try {
            boolean achou = false;
            for (int j = 0; j < 20; j++) {
                List<WebElement> comboItens = locateElement.findElements(By.tagName("div"));
                for (WebElement itemCombo : comboItens) {
                    if (achou)
                        break;
                    List<WebElement> linhaCombo = itemCombo.findElements(By.tagName("div"));
                    for (WebElement itemCombo2 : linhaCombo) {
                        if (achou)
                            break;
                        List<WebElement> linhaCombo2 = itemCombo2.findElements(By.tagName("span"));
                        for (int k = 0; k < (linhaCombo2.size()); k++) {
                            if (valor.equals(linhaCombo2.get(k).getText())) {
                                achou = true;
                                linhaCombo2.get(k).click();
                                break;
                            }
                        }
                    }
                }
                if (achou)
                    break;
            }
            if (!achou) {
                throw new Exception("O registro -> " + valor + " <- não foi encontrado na lista.");
            }
        } catch (NoSuchElementException nsee) {
            throw new NoSuchElementException("Error ao obter o mapeamento do elemento");
        }
    }

    @AfterEach
    public void finalize() {
        // close browser
        driver.quit();
    }
}
