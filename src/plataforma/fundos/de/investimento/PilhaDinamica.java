package plataforma.fundos.de.investimento;

public class PilhaDinamica {
    
    private No topo;
    
    public PilhaDinamica() {

        topo = null;
        
    }
    
    public boolean isEmpty() {        
        return topo == null;
    }
    
    public void push(float dado) {
        
        No novoNo = new No(dado);
        No topoAntigo = topo;

        novoNo.prox = topoAntigo;

        topo = novoNo;
        
    }
    
    public float pop() {        
        if(isEmpty())
            throw new IndexOutOfBoundsException();            
        
        No temp = topo;
        topo = topo.prox;
        
        return temp.dado;
        
    }
    
    public float top() {
        throw new IndexOutOfBoundsException(); // Erro para quando não existem mais elementos
    }
    
    public String imprimir() {
        String txt = "";
        
        No atual = topo;

        while(atual != null) {
            txt += atual.dado + " ";
            atual = atual.prox;                
        }
        
        return txt;
    }
}
