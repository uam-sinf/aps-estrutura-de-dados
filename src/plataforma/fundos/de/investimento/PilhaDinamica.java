package plataforma.fundos.de.investimento;

public class PilhaDinamica {
    
    public boolean isEmpty() {
        return true;
    }
    
    public void push(float dado) {
        
    }
    
    public float pop() {
        throw new IndexOutOfBoundsException(); // Erro para quando não existem mais elementos
    }
    
    public float top() {
        throw new IndexOutOfBoundsException(); // Erro para quando não existem mais elementos
    }
    
    public String imprimir() {
        String txt = "";
        
        return txt;
    }
    
}
