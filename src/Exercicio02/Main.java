package Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        SenhaAtendimento s1 = new SenhaAtendimento("Lucas");
        SenhaAtendimento s2 = new SenhaAtendimento("Nickolas");
        SenhaAtendimento s3 = new SenhaAtendimento("Giovanni");

        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Próxima Senha --> " + SenhaAtendimento.controle);


    }
}
