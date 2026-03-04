package Exercicio01;

public class Produto {

    String nome;
    double valor;
    int quantidade;

    public Produto (String nome, double valor, int quantidade){
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }


    public void somar(double aumento){
        aumento = (aumento/ 100) + 1;
        valor = valor * aumento;

    }

}
