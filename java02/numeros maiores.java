package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner leia = new Scanner(Sytem.in);

	String nome;
	int num1,
        num2,
        num3;
        System.out.println("O maior e numero");
        System.out.print("Caro usuario,por favor digite seu nome:");
        nome = nextFloat();
                System.out.println("Por favaor o primeiro numero: ");
                        num1 = nesxtFloat();
                        System.out.print("Por favaor o segundo numero:");
                                num2 =  nesxtFloat();
                                System.out.print("Por favaor o terceiro numero:");
                                        num3 =  nesxtFloat();
        if(num1 > num2 && num1>num3) {
            System.out.println("O maior número é o: "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("O maior número é "+num2);
        }
        else {
            System.out.println("O maior número é "+num3);
        }
    }
{
    }
}
