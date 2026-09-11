package padraoFactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeitorPptxTest {

    @Test
    void deveExecutarLeituraPptx() {
        ILeitor leitor = LeitorFactory.obterLeitor("Pptx");
        assertEquals("Leitura de arquivo .pptx efetivada.", leitor.executar());
    }

    @Test
    void deveCancelarLeituraPptx() {
        ILeitor leitor = LeitorFactory.obterLeitor("Pptx");
        assertEquals("Leitura de arquivo .pptx cancelada.", leitor.cancelar());
    }
}
