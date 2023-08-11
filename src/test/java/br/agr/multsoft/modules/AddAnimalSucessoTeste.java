package br.agr.multsoft.modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import br.agr.multsoft.driver.GenericPage;
import br.agr.multsoft.pages.LoginPage;

public class AddAnimalSucessoTeste extends GenericPage {

    @DisplayName("Adicionar Animal com sucesso")
    @Test
    public void testAddAnimalSucesso() throws Exception {

        String mensagemExibida = new LoginPage(driver)
            .informarEmail("marcus.tabosa@multbovinos.com.br")
            .informarSenha("Multsoft@123#!")
            .acessarPageListaFazendas()
            .informarCampoPesquisa("FAZENDA A")
            .clicarFazendaGrid("FAZENDA A")
            .menuEntradaAnimais()
            .campoPesquisa("Entry of Animals")
            .clickValorPesquisa("Entry of Animals")
            .incluirAnimal()
            .documentoAuto()
            .sexo("Female")
            .raca("HOLANDÊS - HOL")
            .grauSangue("LA")
            .tipoAnimal("Reproduction")
            .tipoEntrada("Purchase")
            .dataAquisicao("08/07/2023")
            .fornecedor("ADILTON BOFF CARDOSO E OUTROS")
            .proprietario("ADRIANO BRANCO")
            .pesoMedio("200,00")
            .loteEntrada("1")
            .localAquisicao("Ceasa")
            .ordemCompra("")
            .idade("24")
            .propriedadeOrigem("Fazenda Paint")
            .dataIdentificação("09/08/2023")
            .buttonSalvar()

            .captureDisplayedMessage();

            Assertions.assertEquals("[Animal] Field required", mensagemExibida);
    }
}

