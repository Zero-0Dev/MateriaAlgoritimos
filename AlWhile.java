import java.util.Scanner;
public class AlWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //ex1
        System.out.println("\n=== Exercício 1 ===");
        int contador = 100;

        while (contador <= 200) {
            System.out.println(contador);
            contador++;
        }
        //ex2
         System.out.println("\n=== Exercício 2 ===");
        System.out.println();
        
        int contadorEx2 = 1;
        int pares = 0, impares = 0;

        while (contadorEx2 <= 10) {
            System.out.println("Digite o " + contadorEx2 + "º número:");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            contadorEx2++;
        }

        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de ímpares é: " + impares);


        //ex3
        System.out.println();
        System.out.println("\n=== Exercício 3 ===");
        System.out.println("Digite o número final: ");
        int limite = entrada.nextInt();

        int valor = 1;

        while (valor <= limite) {
            System.out.print(valor + " ");
            valor *= 2;
        }
        //ex4
        System.out.println();
        System.out.println("\n=== Exercício 4 ===");
        int numero = 10;

        do {
            double metade = numero / 2.0;
            System.out.println("A metade de " + numero + " é " + metade);
            numero++;
        } while (numero <= 20);
        
        //ex5
        System.out.println();
        System.out.println("\n=== Exercício 5 ===");
        System.out.println("Tabuada do 5:");
          int i = 1;

        do {
            System.out.println("5 x " + i + " = " + (5 * i));
            i++;
        } while (i <= 10);

        //ex6
        System.out.println();
        System.out.println("\n=== Exercício 6 ===");
         int contadorEx6 = 1;
        int menor;

        System.out.println("Digite o 1º número: ");
        menor = entrada.nextInt();

        do {
            contadorEx6++;
            System.out.println("Digite o " + contadorEx6 + "º número: ");
            int numeroEx6 = entrada.nextInt();

            if (numeroEx6 < menor) {
                menor = numeroEx6;
            }

        } while (contadorEx6 < 10);

        System.out.println("O menor número digitado foi: " + menor);

        //ex7

        System.out.println();
        System.out.println("\n=== Exercício 7 ===");
        
        int contadorEx7 = 1;
        int semObesidade = 0;

        do {
            System.out.println("Digite a altura da pessoa " + contadorEx7 + " (em metros): ");
            double altura = entrada.nextDouble();

            System.out.println("Digite o peso da pessoa " + contadorEx7 + " (em kg): ");
            double peso = entrada.nextDouble();

            double imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {
                semObesidade++;
            }

            contadorEx7++;
        } while (contadorEx7 <= 10);

        System.out.println("Quantidade de pessoas sem obesidade: " + semObesidade);

        //ex8
        System.out.println();
        System.out.println("\n=== Exercício 8 ===");
        int aluno = 1;

        do {
            double nota1, nota2;

            
            do {
                System.out.println("Digite a 1ª nota do aluno " + aluno + ": ");
                nota1 = entrada.nextDouble();
            } while (nota1 < 0 || nota1 > 10);

         
            do {
                System.out.println("Digite a 2ª nota do aluno " + aluno + ": ");
                nota2 = entrada.nextDouble();
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;
            System.out.println("A média do aluno " + aluno + " é " + media);

            aluno++;
        } while (aluno <= 5);

        //ex9

        System.out.println();
         System.out.println("\n=== Exercício 9 ===");
        int codigo, quantidade, continuar;
        double totalCompra = 0;

        do {
            System.out.println("Digite o código do produto:");
            codigo = entrada.nextInt();

            System.out.println("Digite a quantidade:");
            quantidade = entrada.nextInt();

            double preco = 0;
            switch (codigo) {
                case 100 -> preco = 1.20;
                case 101 -> preco = 1.30;
                case 102 -> preco = 1.50;
                case 103 -> preco = 1.20;
                case 104 -> preco = 1.30;
                case 105 -> preco = 1.00;
                default -> System.out.println("Código inválido");
            }

            double valorParcial = preco * quantidade;
            totalCompra += valorParcial;

            if (preco > 0) {
                System.out.println("Valor deste item: R$ " + valorParcial);
            }

            System.out.println("Deseja continuar comprando? (1 = Sim, 0 = Não)");
            continuar = entrada.nextInt();

        } while (continuar == 1);

        System.out.println("Total da compra: R$ " + totalCompra);



        
        entrada.close();


    }
}
