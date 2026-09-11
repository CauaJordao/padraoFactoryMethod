package padraoFactoryMethod;

public class LeitorXlsx implements ILeitor {

    public String executar() {
        return "Leitura de arquivo .xlsx efetivada.";
    }

    public String cancelar() {
        return "Leitura de arquivo .xlsx cancelada.";
    }
}