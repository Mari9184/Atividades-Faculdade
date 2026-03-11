//Mariane Santana da Silva RA:1143431607

import java.util.Scanner;
class Main {
    public static void main (String [] args) {
        Scanner ler = new Scanner(System.in);

            //Execício 1

        System.out.println("Digite um numero");
        double N = ler.nextDouble();

        if (N > 20) {
            System.out.println("A metade dets numero é:" + N / 2);
        }

            // Exercício 2

        System.out.println("Informe Sua idade");
        double x = ler.nextDouble();

        if (x >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

            // Exercício 3

        System.out.println("Informe um numero");
        double a = ler.nextDouble();

        System.out.println("Informe um numero");
        double y = ler.nextDouble();

        double M = a - y;

        if (a == y) {
            System.out.println("Estes números são iguais, não ah diferença.");
        } else {
            System.out.println("A diferença entre esses numero é de:" + M);
        }

            // Exercício 4

        System.out.println("Informe um numero");
        float m = ler.nextFloat();

        System.out.println("Informe um numero");
        float n = ler.nextFloat();

        if (m > n) {
            System.out.printf(" %f,%f", x, y);
        } else if (n >= m) {
            System.out.printf(" %f,%f", y, x);
        }

            // Exercício 5

        System.out.println("Informe um numero");
        double k = ler.nextDouble();

        if (100 >= k & 50 <= k) {
            System.out.println("Este número pertence ao intervalo");
        }
        else {
            System.out.println("Não pertence ao intervalo");
        }

            // Exercício 6

        System.out.println("Informe seu sexo ( Feminino=F se Masculino=M ):");
        String Sexo = ler.nextLine();

        System.out.println("Informe sua altura:):");
        double Altura = ler.nextDouble();

        if (Sexo.equals("F")) {
            System.out.println("Seu peso ideal é" + (52 + 0.75 * (Altura - 152.4)));
        }
        if (Sexo.equals("M")) {
            System.out.println("Seu peso ideal é" + (75.7 + 0.75 * (Altura - 152.4)));
        }

            // Exercício 7

        System.out.println(" Quanto tempo está na empresa? ");
        double J = ler.nextDouble();

        System.out.println(" Quanto é o seu salario?");
        double s = ler.nextDouble();

        double NovoS = s + (100 / s) * 20;

        if (J >= 5) {
            System.out.println("Você recebeu um aumento seu salário passou a ser: " + NovoS);
        }
        else {
            System.out.println("Este numero não é divísivel");
        }

            // Exercício 8

        System.out.print("Informe a senha");
        String senha = ler.nextLine();

        if (senha.equals("R10p5")) {
            System.out.print("Sua senha esta correta!!");
        } else {
            System.out.print("Sua senha esta incorreta :/");
        }

            // Exercício 9

        System.out.print("Informe o valor do emprestimo:");
        double E = ler.nextDouble();

        if (E <= (1200/100)*30){
            System.out.print("Você pode receber o emprestimo!!");
        }
        else {
            System.out.print("Você não pode receber o emprestimo :/");
        }

            //Exercicio 10

        System.out.print("Informe o 1° numero");
        double q = ler.nextDouble();

        System.out.print("Informe o 2° numero");
        double w = ler.nextDouble();

        System.out.print("Informe o 3° numero");
        double e = ler.nextDouble();

        if (q == w & w == e) {
            System.out.print("Todos os numero são iguais");
        }
        else if (q > w & q > e) {
            System.out.println("Este é o maior numero:" + q);
        }
        else if (w > q & w > e) {
                System.out.println("Este é o maior numero:" + w);
        }
        else {
            System.out.println("Este é o maior numero:" + e);
        }

            // Exercício 11

        System.out.print("Informe sua idade");
        double idade = ler.nextDouble();

        if (idade >= 5 & idade <= 7) {
            System.out.print("infantil-A");
        }
            else if (idade >= 8 & idade <= 10) {
                System.out.print("infantil-B");
        }
        else if (idade >= 11 & idade <= 13) {
            System.out.print("Juvenil-A");
        }
        else if (idade >= 14 & idade <= 17) {
            System.out.print("Juvenil-B");
        }
        else if (idade >= 18) {
            System.out.print("Sênior");
        }
        else {
            System.out.print("Não tem idade para nadar");
        }

            // Exercicio 12

        System.out.print("Informe seu salário:");
        double salario = ler.nextDouble();

        if (salario <= 600.0) {
            System.out.print("Você está isento de pagar o INSS");
        }
        else if (salario > 600.01 & salario <= 1200.0){
            System.out.println("Você deve pagar 20% do INSS, com o descunto seu saldo fica:" + (salario-(salario/100) * 20));
        }
        else if (salario > 1200.01 & salario <= 2000.0) {
            System.out.println("Você deve pagar 25% do INSS, com o descunto seu saldo fica:" + (salario-(salario/100) * 25));
        }
        else if (salario >= 2000.01 ) {
            System.out.println("Você deve pagar 30% do INSS, com o descunto seu saldo fica:" + (salario-(salario/100) * 30));
        }
        else {
            System.out.print("Não é possivel identificar o que disse");
        }
            // Exercicio 13

        System.out.print("Digite a operação (+, -, *, /): ");
        String operador = ler.nextLine();

        System.out.print("Digite o primeiro número: ");
        double n1 = ler.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = ler.nextDouble();

        if (operador.equals("+")) {
            System.out.println("O resultado é:" + (n1 + n2));
        }
        else if (operador.equals("-")) {
            System.out.println("O resultado é:" + (n1 - n2));
        }
        else if (operador.equals("*")) {
            System.out.println("O resultado é:" + (n1 * n2));
        }
        else if (operador.equals("/")) {System.out.println("O resultado é:" + (n1 / n2));
        }
        else {
            System.out.print("Não é possivel identificar a operação.");
        }
    }
}
