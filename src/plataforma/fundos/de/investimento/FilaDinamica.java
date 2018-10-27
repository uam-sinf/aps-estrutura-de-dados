package plataforma.fundos.de.investimento;

public class FilaDinamica {
    
    private No inicio, fim;
    private int quantidade = 0;
    
    public FilaDinamica(){

        inicio = fim = null;
        quantidade = 0;

    }
    
    public boolean isEmpty() {        
        return quantidade == 0;
    }
    
    public void enqueue(float dado) {
        
        No novoNo = new No(dado);

        if(isEmpty()) {
            inicio = fim = novoNo;
        }
        else {
            fim.prox = novoNo;
            fim = novoNo;
        }

        quantidade++;
        
    }
    
    public float dequeue() {        
        if(isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        else {
            No temp = inicio;

            if(inicio == fim) {
                inicio = fim = null;
            }
            else {
                inicio = inicio.prox;
            }
            quantidade--;
            return temp.dado;

        }
    }
    
    public float front() {        
        if(isEmpty()) {
            throw new IndexOutOfBoundsException();            
        }
        else {
            return inicio.dado;
        }
    }
    
    public String imprimir() {
        String txt = "";        
        
        No atual = inicio;

        while(atual != null) {
            txt += atual.dado + " ";
            atual = atual.prox;
        }
        
        return txt;
    }
}
