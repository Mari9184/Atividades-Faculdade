//Mariane Santana da Silva RA:1143431607

class Main {
    public static void main (String [] args){

        //Variáveis para os exercícios

        int Idade=18, RA=1143431607, num=5;
        double Altura=1.61;
        String Nome="Mariane Santana da Silva",Status= "Presente", Curso="Tecnico em Analise e Desenvolvimento de Sistemas";

        // 1° Exercício

        System.out.printf("\nMeu nome é %s, Estou cursando %s e tenho por RA: %d\n",Nome,Curso,RA);

        // 2° Exercício

        System.out.printf("\nTenho %d anos e %f de altura e estive %s na aula de AP1 no dia 25.02.2026\n",Idade, Altura,Status);

        //  3° Exercício com printf

        System.out.println("\nTABUADA DO 5");
        for (int i=1 ; i <=10; i++){System.out.printf("%d * %d = %d%n",num,i,num*i);}

    }
}
