package pilha;

import static pilha.Nota.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== MEU BLOCO DE NOTAS ===\n");

        criarNota("24/06", "Quarta", "Fazer relátorio dessa atividade amanhã.");

        verNotaAtual();

        System.out.println("--------------------------------");

        criarNota("24/06", "Quarta", "Jogar lixo"
        );

        verNotaAtual();

        System.out.println("--------------------------------");

        editarNota("Ir ao supermercado comprar café e açúcar.");

        verNotaAtual();

        System.out.println("--------------------------------");

        exibirHistorico();

        System.out.println("Desfazendo última nota...\n");

        desfazerNota();

        verNotaAtual();

        System.out.println("--------------------------------");

        exibirHistorico();
    }
}