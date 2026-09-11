package padraoFactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeitorDocxTest {

    @Test
    void deveExecutarLeituraDocx() {
        ILeitor leitor = LeitorFactory.obterLeitor("Docx");
        assertEquals("Leitura de arquivo .docx efetivada.", leitor.executar());
    }

    @Test
    void deveCancelarLeituraDocx() {
        ILeitor leitor = LeitorFactory.obterLeitor("Docx");
        assertEquals("Leitura de arquivo .docx cancelada.", leitor.cancelar());
    }
}