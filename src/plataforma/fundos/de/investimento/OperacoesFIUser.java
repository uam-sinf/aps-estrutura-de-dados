package plataforma.fundos.de.investimento;

class OperacoesFIUser {
    private FilaDinamica ordens = new FilaDinamica();
    
    public void comprar(float montante) {
        ordens.enqueue(montante);
    }
    
    public void vender(float montante) {
        ordens.enqueue(-montante);
    }
    
    public String imprimirOrdensPendentes() {        
        return ordens.imprimir();
    }
    
    public float getProximaOrdem() {
        return ordens.dequeue();
    }
}
