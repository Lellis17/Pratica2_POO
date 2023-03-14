import java.util.Scanner;
public class Estoque {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

    }
    private String nome;
    private int quantidadeAtual, quantidadeMinima;


    public Estoque(String nome, int quantidadeAtual, int quantidadeMinima) {
        this.nome = nome;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Digite o nome do produto em estoque: ");

    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
        if (quantidadeAtual <= 1000)
        System.out.println("Em estoque:");
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }
    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
        if (quantidadeMinima <= 500)
        System.out.println("Estoque baixo: ");
    }
        public void darBaixa (int quatidade){
         if (quatidade <=100)
             System.out.println("Dar baixa");

        }
        public String mostra (){

            return null;
        }
        public boolean precisaRepor (){

            return false;
        }




}
