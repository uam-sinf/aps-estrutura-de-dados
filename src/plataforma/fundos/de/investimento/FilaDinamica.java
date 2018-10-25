package plataforma.fundos.de.investimento;

public class FilaDinamica {
    
    public boolean isEmpty() {
        return true;
    }
    
    public void enqueue(float dado) {
        
    }
    
    public float dequeue() {
        throw new IndexOutOfBoundsException(); // Erro para quando não existem mais elementos
    }
    
    public float front() {
        throw new IndexOutOfBoundsException(); // Erro para quando não existem mais elementos
    }
    
    public String imprimir() {
        String txt = "";
        
        return txt;
    }
}
