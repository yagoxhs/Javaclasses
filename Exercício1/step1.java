
package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String nome = "Inatel";

        System.out.println(nome);
        System.out.println(nome.length());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.replace("Inatel", "Iajfsafas"));


        double horas = 3;
        int primeiraHora = 10;
        int segundaHora = 4;
        int terceiraHora = 2;

        int soma = primeiraHora + segundaHora + terceiraHora;
        double media = soma / horas;

        System.out.println("Total: " + soma);
        System.out.println("Media: " + media);
    }
}



