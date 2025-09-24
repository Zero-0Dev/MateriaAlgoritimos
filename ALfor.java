import java.util.Scanner;
public class ALfor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //ex1

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
        //ex2


        for (int i = 15; i <= 100; i++) {
            int quadrado = i * i;
            System.out.println("O quadrado de " + i + " é " + quadrado);
        }
        //ex3

        System.out.println("Digite um número: ");
        int numex3 = entrada.nextInt();

        for (int i = 1; i <= numex3; i++) {
            System.out.print(i + " ");
        }


        //ex4
        int idade;
        double altura, somaAlturas = 0;
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite a idade " + i + ": ");
            idade = entrada.nextInt();

            System.out.println("Digite a  " + i + ": ");
            altura = entrada.nextDouble();

            if (idade > 50) {
                somaAlturas += altura;
                contador++;
            }
        }

        if (contador > 0) {
            double media = somaAlturas / contador;
            System.out.println("A média das alturas das pessoas com mais de 50 anos é: " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos foi declarada.");
        }


        //ex5
         System.out.println();
        int aprovados = 0, exames = 0, reprovados = 0;
        double somaMedias = 0;

        System.out.println("Digite as notas de 6 alunos:");
        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite a primeira nota do aluno " + i + ": ");
            double nota1 = entrada.nextDouble();

            System.out.println("Digite a segunda nota do aluno " + i + ": ");
            double nota2 = entrada.nextDouble();

            double media = (nota1 + nota2) / 2;
            somaMedias += media;

            System.out.println("A média do aluno " + i + " é " + media);

            if (media <= 3) {
                System.out.println("REPROVADO");
                reprovados++;
            } else if (media < 7) {
                System.out.println("EXAME");
                exames++;
            } else {
                System.out.println("APROVADO");
                aprovados++;
            }
        }

        double mediaClasse = somaMedias / 6;

        System.out.println("Total de aprovados: " + aprovados);
        System.out.println("Total de exames: " + exames);
        System.out.println("Total de reprovados: " + reprovados);
        System.out.println("Média da classe: " + mediaClasse);

         System.out.println();
         //ex6
         System.out.println();
        int candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0;
        int nulos = 0, brancos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite seu voto (1 a 6): ");
            int voto = entrada.nextInt();

            switch (voto) {
                case 1 -> candidato1++;
                case 2 -> candidato2++;
                case 3 -> candidato3++;
                case 4 -> candidato4++;
                case 5 -> nulos++;
                case 6 -> brancos++;
                default -> System.out.println("Voto inválido");
            }
        }

            System.out.println("Total de votos candidato 1: " + candidato1);
            System.out.println("Total de votos candidato 2: " + candidato2);
            System.out.println("Total de votos candidato 3: " + candidato3);
            System.out.println("Total de votos candidato 4: " + candidato4);
            System.out.println("Total de votos nulos: " + nulos);
            System.out.println("Total de votos em branco: " + brancos);

            double percentual = (nulos + brancos) * 100.0 / 10;
            System.out.println("Percentual de votos brancos e nulos: " + percentual + "%");

        //ex7
            System.out.println();
            int mais50 = 0, entre10e20 = 0, abaixo40kg = 0;
            double somaAlturas10a20 = 0;

            for (int i = 1; i <= 10; i++) {
            System.out.println("Digite a idade da pessoa " + i + ": ");
            int idadeEx7 = entrada.nextInt();

            System.out.println("Digite a altura da pessoa " + i + ": ");
            double alturaEx7 = entrada.nextDouble();

            System.out.println("Digite o peso da pessoa " + i + ": ");
            double peso = entrada.nextDouble();

            if (idadeEx7 > 50) {
                mais50++;
            }

            if (idadeEx7 >= 10 && idadeEx7 <= 20) {
                somaAlturas10a20 += alturaEx7;
                entre10e20++;
            }

            if (peso < 40) {
                abaixo40kg++;
            }
        }

        System.out.println("Quantidade de pessoas com mais de 50 anos: " + mais50);

        if (entre10e20 > 0) {
            double mediaAlturas = somaAlturas10a20 / entre10e20;
            System.out.println("Média das alturas (10 a 20 anos): " + mediaAlturas);
        } else {
            System.out.println("Nenhuma pessoa entre 10 e 20 anos.");
        }

        double porcentagem = (abaixo40kg * 100.0) / 10;
        System.out.println("Porcentagem de pessoas com peso < 40kg: " + porcentagem + "%");

        

        entrada.close();
    }
}