package padraoFactoryMethod;

public class LeitorPdf implements ILeitor {

    public String executar() {
        return "Leitura de arquivo .pdf efetivada.";
    }

    public String cancelar() {
        return "Leitura de arquivo .pdf cancelada.";
    }
}