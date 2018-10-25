package plataforma.fundos.de.investimento;

public class FilaDinamica {
    
    private No inicio, fim;
    private int quantidade = 0;
    
    public FilaDinamica(){

        inicio = fim = null;
        quantidade = 0;

    }
    
    public boolean isEmpty() {
        
        if(quantidade == 0){

            return true;

        }
    }
    
    public void enqueue(float dado) {
        
        No novoNo = new No(dado);

        if(isEmpty()) {

            inicio = fim = novoNo;

        }
        else {

            fim.next = novoNo;
            fim = novoNo

        }

        quantidade++;
        
    }
    
    public float dequeue() {
        throw new IndexOutOfBoundsException(); // Erro para quando não existem mais elementos
        
        if(isEmpty()) {

            return -1;
        }
        else {

            No temp = inicio;

            if(inicio == fim) {

                inicio = fim = null;

            }
            else {

                inicio = inicio.next;

            }
            quantidade--;
            return temp.dado;

        }
    }
    
    public float front() {
        throw new IndexOutOfBoundsException(); // Erro para quando não existem mais elementos
        
        if(inicio != null) {
            
            
        }
        
    }
    
    public String imprimir() {
        
        if(isEmpty()) {

            return "Não há investimentos!"

        }
        else {
            String txt = "";
            No atual = inicio;

            while(atual != null) {

                saida += atual.imprimir() + " ";
                atual = atual.next;

            }
        }
        return txt;
    }
}
