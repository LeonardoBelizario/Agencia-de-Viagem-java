package agencia;

public class PacoteViagem{
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int dias;
    
    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int dias){
        this.transporte= transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.dias = dias;
    }
    
    //calculo total da hospedagem
    public double calcularHospedagem(){
        return dias * hospedagem.getValorDiaria();
    }
    
    //calculo valor com margem de lucro
    public double calcularLucro(double valor, double margem){
        return valor * (margem/100);
    }
     
    //calculo total do pacote
    public double calcularTotal(double margem, double taxas){
        double totalBase = transporte.getValor() + calcularHospedagem();
        double totalComLucro = calcularLucro(totalBase, margem);
        return totalBase + totalComLucro + taxas;
    }
    
    public String getDestino(){
        return destino;
    }
}