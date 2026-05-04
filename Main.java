package agencia;

import java.util.Scanner;
        
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Transpote
        System.out.print("Tipo de transporte:");
        String tipo = sc.nextLine();
        
        System.out.print("Valor do transporte (USD): $ ");
        double valorTransporte = sc.nextDouble();
        sc.nextLine();
        
        Transporte transporte = new Transporte(tipo, valorTransporte);
        
        //Hospedagem
        System.out.print("Descricao da Hospedagem: ");
        String descricao = sc.nextLine();
        
        System.out.print("Valor da Diaria (USD): $ ");
        double diaria = sc.nextDouble();
        sc.nextLine();
        
        Hospedagem hospedagem = new Hospedagem(descricao, diaria);
        
        //Pacote
        sc.nextLine();
        System.out.print("Destino: ");
        String destino = sc.nextLine();
        
        System.out.print("Quantidade de dias: ");
        int dias = sc.nextInt();
        sc.nextLine();
        
        PacoteViagem pacote = new PacoteViagem(transporte, hospedagem, destino,dias);
        
        //Valores extras
        System.out.print("Margem de lucro(%): ");
        double margem = sc.nextDouble();
        
        System.out.print("Taxas adicionais (USD): $ ");
        double taxas = sc.nextDouble();
        
        //Venda
        sc.nextLine();
        System.out.print("Nome do cliente: ");
        String cliente = sc.nextLine();
        
        System.out.print("Forma de pagamento: ");
        String pagamento = sc.nextLine();
        
        Venda venda = new Venda(cliente, pagamento, pacote);
        
        //Cotação
        System.out.print("Cotação do dolar:  ");
        double cotacao = sc.nextDouble();
        
        // Resultado Final
        venda.mostrarVendas(margem, taxas, cotacao);
        
        sc.close();
     }
}
