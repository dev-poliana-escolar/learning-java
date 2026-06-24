package pilha;

import java.util.Stack;

public class Nota {

    private String data;
    private String diaSemana;
    private String texto;

    // Pilha que armazena o histórico das notas
    private static Stack<Nota> blocoDeNotas = new Stack<>();

    public Nota(String data, String diaSemana, String texto) {
        this.data = data;
        this.diaSemana = diaSemana;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "[" + data + " - " + diaSemana + "] " + texto;
    }

    // PUSH
    public static void criarNota(String data, String diaSemana, String texto) {
        Nota novaNota = new Nota(data, diaSemana, texto);
        blocoDeNotas.push(novaNota);

        System.out.println("-> Nova nota criada com sucesso.");
    }

    // PEEK
    public static void verNotaAtual() {
        if (blocoDeNotas.isEmpty()) {
            System.out.println("Nenhuma nota encontrada. O bloco está vazio.");
            return;
        }

        System.out.println("Nota atual: " + blocoDeNotas.peek());
    }

    // PUSH (edita a nota)
    public static void editarNota(String novoTexto) {

        if (blocoDeNotas.isEmpty()) {
            System.out.println("Não há nota para editar.");
            return;
        }

        Nota notaAtual = blocoDeNotas.peek();

        Nota notaEditada = new Nota(
                notaAtual.data,
                notaAtual.diaSemana,
                novoTexto
        );

        blocoDeNotas.push(notaEditada);

        System.out.println("-> Nota editada. Nova versão salva no topo");
    }

    // POP
    public static void desfazerNota() {

        if (blocoDeNotas.size() <= 1) {
            System.out.println("Não há alterações para desfazer.");
            return;
        }

        Nota removida = blocoDeNotas.pop();

        System.out.println("[Ctrl+Z] Nota desfeita.");
        System.out.println("Versão removida: " + removida.texto);
    }

    public static void exibirHistorico() {

        if (blocoDeNotas.isEmpty()) {
            System.out.println("Histórico vazio.");
            return;
        }

        System.out.println("\n=== HISTÓRICO DA PILHA ===");

        for (int i = blocoDeNotas.size() - 1; i >= 0; i--) {
            System.out.println(blocoDeNotas.get(i));
        }

        System.out.println("==========================\n");
    }
}