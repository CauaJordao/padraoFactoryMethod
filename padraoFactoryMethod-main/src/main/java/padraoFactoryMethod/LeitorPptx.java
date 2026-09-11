package padraoFactoryMethod;

public class LeitorPptx implements ILeitor {

    public String executar() {
        return "Leitura de arquivo .pptx efetivada.";
    }

    public String cancelar() {
        return "Leitura de arquivo .pptx cancelada.";
    }
}