import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaIngressos {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {

            System.out.println("\n===== VENDA DE INGRESSOS =====");
            System.out.println("1 - Entrar na fila");
            System.out.println("2 - Atender cliente");
            System.out.println("3 - Mostrar proximo cliente");
            System.out.println("4 - Mostrar fila");
            System.out.println("5 - Verificar se a fila esta vazia");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome do cliente: ");
                    String nome = sc.nextLine();

                    fila.add(nome);

                    System.out.println(nome + " entrou na fila.");
                    break;

                case 2:

                    if (fila.isEmpty()) {
                        System.out.println("Nao ha clientes na fila.");
                    } else {

                        String atendido = fila.remove();

                        System.out.println(atendido + " comprou o ingresso.");
                    }

                    break;

                case 3:

                    if (fila.isEmpty()) {
                        System.out.println("A fila esta vazia.");
                    } else {

                        System.out.println("Proximo cliente: " + fila.peek());

                    }

                    break;

                case 4:

                    if (fila.isEmpty()) {
                        System.out.println("A fila esta vazia.");
                    } else {

                        System.out.println("\nFila atual:");

                        int posicao = 1;

                        for (String cliente : fila) {
                            System.out.println(posicao + " - " + cliente);
                            posicao++;
                        }
                    }

                    break;

                case 5:

                    if (fila.isEmpty()) {
                        System.out.println("A fila esta vazia.");
                    } else {
                        System.out.println("Existem " + fila.size() + " clientes na fila.");
                    }

                    break;

                case 0:

                    System.out.println("Sistema encerrado.");
                    break;

                default:

                    System.out.println("Opcao invalida.");

            }

        } while (opcao != 0);

    }
}
