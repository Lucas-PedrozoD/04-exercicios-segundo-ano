package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        double valor;
        int quantidade;
        System.out.print("Nome do produto: ");
        nome =sc.next();
        System.out.print("Valor do Produto: ");
        valor =sc.nextDouble();
        System.out.print("Quantidade: ");
        quantidade =sc.nextInt();
        Produto produto= new Produto(nome, valor, quantidade);


        System.out.print("Qual a % de aumento no produto -->");
        double aumento = sc.nextDouble();
        produto.somar(aumento);

        System.out.println("Nome: " + produto.nome);
        System.out.print("Novo valor: $" + produto.valor);



    }
}
