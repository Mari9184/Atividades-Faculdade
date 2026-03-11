//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);

       // Exercício 5

        System.out.println("Informe um numero");
        double k = ler.nextDouble();

        if (100 >= k & 50 <= k) {
            System.out.println("Este número pertence ao intervalo");
        }
        else {
            System.out.println("Não pertence ao intervalo");
        }
    }
}
