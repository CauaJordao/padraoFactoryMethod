package padraoFactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeitorPdfTest {

    @Test
    void deveExecutarLeituraPdf() {
        ILeitor leitor = LeitorFactory.obterLeitor("Pdf");
        assertEquals("Leitura de arquivo .pdf efetivada.", leitor.executar());
    }

    @Test
    void deveCancelarLeituraPdf() {
        ILeitor leitor = LeitorFactory.obterLeitor("Pdf");
        assertEquals("Leitura de arquivo .pdf cancelada.", leitor.cancelar());
    }

}
