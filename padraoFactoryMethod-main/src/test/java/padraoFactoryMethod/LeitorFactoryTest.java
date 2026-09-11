package padraoFactoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeitorFactoryTest {

    @Test
    void deveRetornarExcecaoLeitorInexistente() {
        try {
            ILeitor leitor = LeitorFactory.obterLeitor("Xml");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Leitor inexistente.", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoLeitorInvalido() {
        try {
            ILeitor leitor = LeitorFactory.obterLeitor("Csv");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Leitor inválido.", e.getMessage());
        }
    }
}
