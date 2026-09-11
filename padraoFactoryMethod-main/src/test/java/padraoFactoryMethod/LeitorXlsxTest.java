package padraoFactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeitorXlsxTest {

    @Test
    void deveExecutarLeituraXlsx() {
        ILeitor leitor = LeitorFactory.obterLeitor("Xlsx");
        assertEquals("Leitura de arquivo .xlsx efetivada.", leitor.executar());
    }

    @Test
    void deveCancelarLeituraXlsx() {
        ILeitor leitor = LeitorFactory.obterLeitor("Xlsx");
        assertEquals("Leitura de arquivo .xlsx cancelada.", leitor.cancelar());
    }
}
