package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num, pol;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um numero; ");
        num = in.nextInt();
        pol = (num%2);
        if (pol==0){
            System.out.print("O numero "+num+" e par");
        } else{
            System.out.print("O numero "+num+" e impar");
        }

    }

}
