import java.util.Scanner;

public class sw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1
        System.out.println("A seguir escolha um numero de 1 a 7:");
        System.out.println("Um numero corresponde a um dia da semana, escolha conforme o dia de hoje:");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1: System.out.println("1 Domingo");
                break;
            case 2: System.out.println("2 Segunda");
                break;
            case 3: System.out.println("3 Terça");
                break;
            case 4: System.out.println("4 Quarta");
                break;
            case 5: System.out.println("5 Quinta");
                break;
            case 6: System.out.println("6 Sexta");
                break;
            case 7: System.out.println("7 Sábado");
                break;
            default: System.out.println("Número inválido! Por favor, escolha um número de 1 a 7.");

        }

        // Exercício 2
        System.out.println("A seguir escolha um numero de 1 a 12:");
        System.out.println("Um numero corresponde a um mês do ano:");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1: System.out.println("1 Janeiro");
                break;
            case 2: System.out.println("2 Fevereiro");
                break;
            case 3: System.out.println("3 Março");
                break;
            case 4: System.out.println("4 Abril");
                break;
            case 5: System.out.println("5 Maio");
                break;
            case 6: System.out.println("6 Junho");
                break;
            case 7: System.out.println("7 Julho");
                break;
            case 8: System.out.println("8 Agosto");
                break;
            case 9: System.out.println("9 Setembro");
                break;
            case 10: System.out.println("10 Outubro");
                break;
            case 11: System.out.println("11 Novembro");
                break;
            case 12: System.out.println("12 Dezembro");
                break;
            default: System.out.println("Número inválido! Por favor, escolha um número de 1 a 12.");
        }
        scanner.nextLine();

        // Exercício 3
        System.out.println("Escolha o período que estuda: M - Matutino / V - Vespertino / N - Noturno");
        System.out.println("Digite uma letra correspondente ao período:");
        String periodo = scanner.nextLine().toUpperCase();

        switch (periodo) {
            case "M": System.out.println("Bom dia");
                break;
            case "V": System.out.println("Boa tarde");
                break;
            case "N": System.out.println("Boa noite");
                break;
            default: System.out.println("Escolha uma das opções válidas.");
                break;
        }

        // Exercício 4
        System.out.println();
        System.out.println("Qual é seu salário atual?");
        Double salarioEx4 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Entre os planos qual é o seu (A/B/C)?");
        String planoEx4 = scanner.nextLine().toUpperCase();

        switch (planoEx4) {
            case "A":
                System.out.printf("O seu novo salário é %.2f%n", salarioEx4 * 1.10);
                break;
            case "B":
                System.out.printf("O seu novo salário é %.2f%n", salarioEx4 * 1.15);
                break;
            case "C":
                System.out.printf("O seu novo salário é %.2f%n", salarioEx4 * 1.20);
                break;
            default:
                System.out.println("Plano inválido");
        }

        // Exercício 5
        System.out.println();
        System.out.println("Para fazer a operação digite o primeiro numero:");
        int ex01_5 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        int ex02_5 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Escolha a operação:");
        System.out.println("M - média entre os números");
        System.out.println("S - diferença do maior para o menor");
        System.out.println("P - produto entre os números");
        System.out.println("D - divisão do primeiro pelo segundo");
        String Op = scanner.nextLine().toUpperCase();

        switch (Op) {
            case "M":
                System.out.println("Média: " + ((ex01_5 + ex02_5) / 2.0));
                break;
            case "S":
                System.out.println("Diferença: " + Math.abs(ex01_5 - ex02_5));
                break;
            case "P":
                System.out.println("Produto: " + (ex01_5 * ex02_5));
                break;
            case "D":
                if (ex02_5 != 0) {
                    System.out.println("Divisão: " + ((double) ex01_5 / ex02_5));
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida");
        }

        // Exercício 6

        System.out.println();
        System.out.println("===== Cardápio =====");
        System.out.println("100 - Cachorro-quente   R$ 4,00");
        System.out.println("101 - Bauru Simples     R$ 4,50");
        System.out.println("102 - Bauru com ovo     R$ 5,00");
        System.out.println("103 - Hambúrguer        R$ 5,50");
        System.out.println("104 - Cheeseburguer     R$ 6,00");
        System.out.println("105 - Refrigerante      R$ 3,00");
        System.out.println("=====================");

        System.out.println("Digite o código do produto que deseja:");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade:");
        int qtd = scanner.nextInt();

        switch (codigo) {
            case 100:
                System.out.printf("Você pediu %d Cachorro quente%n", qtd);
                System.out.printf("Valor total: R$ %.2f%n", qtd * 1.20);
                break;
            case 101:
                System.out.printf("Você pediu %d bauru Simples%n", qtd);
                System.out.printf("Valor total: R$ %.2f%n", qtd * 1.30);
                break;
            case 102:
                System.out.printf("Você pediu %d bauru com ovo%n", qtd);
                System.out.printf("Valor total: R$ %.2f%n", qtd * 1.50);
                break;
            case 103:
                System.out.printf("Você pediu %d hambúrguer%n", qtd);
                System.out.printf("Valor total: R$ %.2f%n", qtd * 1.20);
                break;
            case 104:
                System.out.printf("Você pediu %d Cheeseburguer%n", qtd);
                System.out.printf("Valor total: R$ %.2f%n", qtd * 1.30);
                break;
            case 105:
                System.out.printf("Você pediu %d x Refrigerante%n", qtd);
                System.out.printf("Valor total: R$ %.2f%n", qtd * 1.00);
                break;
            default:
                System.out.println("Código inválido!");
        }


        scanner.close();
    }
}
