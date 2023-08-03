
package provacrud;

class Produto {
    private String nome;
    private Double valorUnitario;
    private int qtdDisponivel;
    private int qtdReserva;
    
    public Produto(String nome, Double valorUnitario, int qtdDisp, int qtdRes){
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.qtdDisponivel = qtdDisp;
        this.qtdReserva = qtdRes;
    }
   
    public void entradaProduto(int qtdEntrada){
    
    }
    
    public void saidaProduto(int qtdSaida){
    
    }
    
    public String toString(){
        return "";
    }
}
