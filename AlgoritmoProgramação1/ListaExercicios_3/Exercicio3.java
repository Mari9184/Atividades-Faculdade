//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Exercicio 3
        
        System.out.println("Em que periodo você estuda?\n M - Matutino \n V - Vespertino \n N - Noturno");
        String P = ler.nextLine();

        switch (P) {
            case "M":
                System.out.print("Bom dia!");
            break;
            
            case "V":
                System.out.print("Boa tarde!");
            break;
            
            case "N":
                System.out.print("Boa Noite!");
            break;
            
            default:
                System.out.print("Não possui este periodo.");
        }
    }
}
