//Mariane Santana da Silva RA:1143431607

import java.lang.Math;
import java.util.Scanner;

class Main {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);

        // Exercício 8

        System.out.printf("\nO recultado da expressão 1 é:"+(Math.pow(3,30) == (120-30)));
        System.out.printf("\nO recultado da expressão 2 é:"+(!((20%4/2)==1)||(9 != 9)));
        System.out.printf("\nO recultado da expressão 3 é:"+((5%2)>3));
        System.out.printf("\nO recultado da expressão 3 é:"+("A"=="a"));
    }
}
