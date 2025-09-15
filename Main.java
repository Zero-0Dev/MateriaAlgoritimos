import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo! Você verá a lista dos 18 tipos de golpes mais comuns segundo o Banco Central.");
        System.out.println("Pressione ENTER para começar...");
        entrada.nextLine();

        for (int i = 1; i <= 18; i++) {
            System.out.println("\n------------------------------");
            System.out.println("Golpe " + i + ":");
            switch (i) {
                case 1:
                    System.out.println("Vítima fez um Pix e percebeu que caiu em golpe");
                    break;
                case 2:
                    System.out.println("Golpe do presente");
                    break;
                case 3:
                    System.out.println("Vítima fez uma TED e caiu em golpe");
                    break;
                case 4:
                    System.out.println("Compra com cartão e caiu em golpe");
                    break;
                case 5:
                    System.out.println("Boleto falso");
                    break;
                case 6:
                    System.out.println("Banco do golpista sem dinheiro para devolver");
                    break;
                case 7:
                    System.out.println("Compra com cartão não reconhecida");
                    break;
                case 8:
                    System.out.println("Compra em maquininha não reconhecida");
                    break;
                case 9:
                    System.out.println("Golpe do falso entregador/motoboy");
                    break;
                case 10:
                    System.out.println("Falsas centrais de atendimento");
                    break;
                case 11:
                    System.out.println("Golpes envolvendo Valores a Receber");
                    break;
                case 12:
                    System.out.println("Golpes de empréstimo falso (depósito prévio)");
                    break;
                case 13:
                    System.out.println("Golpes usando nome do Banco Central");
                    break;
                case 14:
                    System.out.println("Golpes com mensagem Swift ou títulos do Tesouro");
                    break;
                case 15:
                    System.out.println("Golpes contra prefeituras");
                    break;
                case 16:
                    System.out.println("Golpes envolvendo o Meu BC");
                    break;
                case 17:
                    System.out.println("Dicas gerais para evitar golpes");
                    break;
                case 18:
                    System.out.println("Atuação do Banco Central na prevenção");
                    break;
            }

            System.out.print("Deseja saber mais sobre este golpe ou como agir caso seja vítima? (1 = Sim / 2 = Não): ");
            int escolha = entrada.nextInt();
            entrada.nextLine();

            if (escolha == 1) {
                System.out.println("Resumo sobre este golpe:");
                switch (i) {
                    case 1:
                        System.out.println("Para recorrer, contate o banco e registre BO. Existe o MED do Pix para devolução em até 7 dias.");
                        break;
                    case 2:
                        System.out.println("Pedem dados pessoais ou selfie para abrir conta ou empréstimo em seu nome.");
                        break;
                    case 3:
                        System.out.println("Contate o banco e registre BO com os dados da TED o mais breve possível.");
                        break;
                    case 4:
                        System.out.println("Contate o banco imediatamente e conteste a compra.");
                        break;
                    case 5:
                        System.out.println("Verifique o beneficiário e o banco antes de pagar qualquer boleto.");
                        break;
                    case 6:
                        System.out.println("Devoluções podem ser parciais em até 90 dias, se o golpista não tiver saldo.");
                        break;
                    case 7:
                        System.out.println("Contate o banco e registre BO para contestar compras desconhecidas.");
                        break;
                    case 8:
                        System.out.println("Confirme valores na maquininha, desconfie de falhas no visor.");
                        break;
                    case 9:
                        System.out.println("Nunca entregue cartão/senha para supostos motoboys enviados pelo banco.");
                        break;
                    case 10:
                        System.out.println("Golpistas fingem ser do banco e pedem operações falsas. Não siga instruções.");
                        break;
                    case 11:
                        System.out.println("Só existe o site oficial valoresareceber.bcb.gov.br para consulta.");
                        break;
                    case 12:
                        System.out.println("Nunca pague taxa antecipada para obter empréstimos.");
                        break;
                    case 13:
                        System.out.println("O Banco Central não cobra dívidas nem pede senhas/dados.");
                        break;
                    case 14:
                        System.out.println("Mensagens Swift ou títulos do Tesouro usados em fraudes. O BC não emite títulos.");
                        break;
                    case 15:
                        System.out.println("BC não bloqueia contas de prefeituras. Só juiz/tribunal pode.");
                        break;
                    case 16:
                        System.out.println("O acesso ao Meu BC é só pelo site oficial. Não clique em links falsos.");
                        break;
                    case 17:
                        System.out.println("Confirme pedidos, não aceite ajuda de estranhos, cuidado com prêmios.");
                        break;
                    case 18:
                        System.out.println("O BC cria normas de segurança, mas não resolve casos individuais.");
                        break;
                }
            }
            System.out.println("Pressione ENTER para continuar...");
            entrada.nextLine();
        }

        System.out.println("\nFim da lista. Fique atento e proteja seus dados!");
        entrada.close();
    }
}
