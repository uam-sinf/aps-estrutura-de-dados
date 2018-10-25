package plataforma.fundos.de.investimento;

public class OperacoesFIAdmin {
    private OperacoesFIUser operacoesDeUsuario;
    private PilhaDinamica ordensConcluidas;
    
    public OperacoesFIAdmin(OperacoesFIUser operacaoUsuario) {
        operacoesDeUsuario = operacaoUsuario;
        ordensConcluidas = new PilhaDinamica();
    }
    
    public String imprimirOrdensPendentes() {
        return operacoesDeUsuario.imprimirOrdensPendentes();
    }
    
    public String imprimirOrdensConcluidas() {        
        return ordensConcluidas.imprimir();
    }
    
    public void processarOrdensPendentes() {
        while (true) {
            try {
                ordensConcluidas.push(operacoesDeUsuario.getProximaOrdem());
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
    }
}