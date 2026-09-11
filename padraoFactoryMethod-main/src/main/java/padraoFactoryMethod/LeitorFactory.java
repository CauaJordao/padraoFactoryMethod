package padraoFactoryMethod;

public class LeitorFactory {

    public static ILeitor obterLeitor(String leitor) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padraoFactoryMethod.Leitor" + leitor);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Leitor inexistente.");
        }
        if (!(objeto instanceof ILeitor)) {
            throw new IllegalArgumentException("Leitor inválido.");
        }
        return (ILeitor) objeto;
    }
}
