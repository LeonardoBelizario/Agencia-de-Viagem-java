package agencia;

public class Venda{
    private String cliente;
    private String formaPagamento;
    private PacoteViagem pacote;
    
    public Venda(String cliente, String formaPagamento, PacoteViagem pacote){
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }
    
   //conversao de dolar para real
    public double converterParaReal(double valorDolar, double cotacao){
        return valorDolar*cotacao;
    }
    
    public void mostrarVendas(double margem, double taxas, double cotacao){
        double totalDolar = pacote.calcularTotal(margem, taxas);
        double totalReal = converterParaReal(totalDolar, cotacao);
        
        System.out.println("\n=====DADOS DA VENDA=====");
        System.out.println("Cliente" + cliente);
        System.out.println("Forma de pagamento" + formaPagamento);
        System.out.println("Destino" + pacote.getDestino());
        System.out.println("Valor total (USD): $" + totalDolar);
        System.out.println("Valor total (BRL): R$" + totalReal);
    }
}