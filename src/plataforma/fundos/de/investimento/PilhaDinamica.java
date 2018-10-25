package plataforma.fundos.de.investimento;

public class PilhaDinamica {
    
    private No topo;
    
    public PilhaDinamica() {

        topo = null;
        
    }
    
    public boolean isEmpty() {
        
        if(topo == null){
            return true;

        }
    }
    
    public void push(float dado) {
        
        No novoNo = new No(dado);
        No topoAntigo = topo;

        novoNo.prox = topoAntigo;

        topo = novoNo;
        
    }
    
    public float pop() {
        throw new IndexOutOfBoundsException(); // Erro para quando não existem mais elementos
        
        if(isEmpty()) {

            return -1;
            
        }
        else {

            No temp = topo;
            topo = topo.prox;
                        
        }
        return temp.dado;
        
    }
    
    public float top() {
        throw new IndexOutOfBoundsException(); // Erro para quando não existem mais elementos
    }
    
    public String imprimir() {
        
        if(isEmpty()) {

            System.out.println("Não há investimentos!"); 
                      
        }
        else {
            String txt = "";
            No atual = topo;

            while(atual != null) {

                atual.imprime();
                atual = atual.prox;
                
            }
        return txt;
    }    
}
