package padraoFactoryMethod;

public class LeitorDocx implements ILeitor {

    public String executar() {
        return "Leitura de arquivo .docx efetivada.";
    }

    public String cancelar() {
        return "Leitura de arquivo .docx cancelada.";
    }
}