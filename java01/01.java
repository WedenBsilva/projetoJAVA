package com.company;

public class Main {

    public static void main(String[] args) {
import java.util.Scanner;

        public class Exercicio1 {

            public static void main(String[] args) {
                Scanner scan= new Scanner(System.in);
                float salario, abono, salarioAtualizado;
                System.out.println("Digite o valor do seu salário:");
                salario= scan.nextFloat();
                System.out.println("Digite o valor do abono:");
                abono= scan.nextFloat();
                salarioAtualizado=salario + abono;
                System.out.println("---------------------------------");
                System.out.println("Seu salário atualizado é: "+salarioAtualizado);
                System.out.println("---------------------------------");


            }

        }
}
