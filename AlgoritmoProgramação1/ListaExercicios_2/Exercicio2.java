//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);
      
            // Exercício 2

        System.out.println("Informe Sua idade");
        double x = ler.nextDouble();

        if (x >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
    }
}
