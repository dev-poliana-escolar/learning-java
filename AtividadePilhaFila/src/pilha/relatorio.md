# Relatório da aplicação

### SUMÁRIO

1. [Classe `Nota.java`](#classe-notajava)
2. [Classe de execução `Main.java`]()

## Bloco de notas como pilhas

1. Estrutura de arquivos:
    ```
    AtividadePilhaFila/
    └── src
        └── pilha
            ├── Main.java
            ├── Nota.java
            └── relatorio.md
    ```

---

## Classe `Nota.java`

Esta classe possui os atributos denominados de `data` (string), `diaSemana` (string),`texto` (string) e `blocoDeNotas` (stack). O último atributo é uma pilha que armazena as notas que serão registradas

---

Além do método construtor, a classe tem um `@Override - toString()` que imprime os dados nesse formato: *"[25/06] - Comprar café"*

Os demais métodos compreendem o push (inserção), pop(delete) e peek(exibir o topo). Com os seguintes nomes: `criarNota()`, `verNotaAtual()`, `editarNota()` e `desfazerNota()`, com um adicional chamado `exibirHistorico()`, ou seja, é um `get` da pilha.

---

### Métodos

Esta seção possui a explicação do comportamento de cada método criado para esta aplicação.

1. `criarNota()`:
    ```java
    public static void criarNota(String data, String diaSemana, String texto) {
            Nota novaNota = new Nota(data, diaSemana, texto); // cria um objeto Nota com o que foi inserido nos parâmetros 
            blocoDeNotas.push(novaNota); // insere na pilha

            System.out.println("-> Nova nota criada com sucesso."); // mensagem de sucesso
        }
    ```

2. `verNotaAtual()`
    ```java
    public static void verNotaAtual() {
            if (blocoDeNotas.isEmpty()) {
                System.out.println("Nenhuma nota encontrada. O bloco está vazio.");
                return;
            } // verifica se a pilha está vazia. Se estiver, dá um output como mensagem

            System.out.println("Nota atual: " + blocoDeNotas.peek()); // se não, exibe o topo da pilha
        }
    ```

3. `editarNota()`
Esse método integra tanto o `push` quanto o `peek`. O objetivo desse método é editar apenas o texto da última nota inserida. 

    ```java
    public static void editarNota(String novoTexto) {

            if (blocoDeNotas.isEmpty()) {
                System.out.println("Não há nota para editar.");
                return;
            } // verifica se a pilha está vazia

            Nota notaAtual = blocoDeNotas.peek(); // espia a nota do topo da pilha e guarda na váriavel @notaAtual

            Nota notaEditada = new Nota(
                    notaAtual.data,
                    notaAtual.diaSemana,
                    novoTexto
            ); // @notaEditada recebe a data e o dia da semana da nota 'espiada', mas altera o texto.

            blocoDeNotas.push(notaEditada); //insere

            System.out.println("-> Nota editada. Nova versão salva no topo");
        }
    ```

4. `desfazerNota()`\
O objetivo desse método é remover última nota inserida, isto é, a nota do topo da pilha.

    ```java
    public static void desfazerNota() {

            if (blocoDeNotas.size() <= 1) {
                System.out.println("Não há notas para desfazer.");
                return;
            } // verifica se a nota está vazia

            Nota removida = blocoDeNotas.pop(); // deleta a nota do topo da pilha

            System.out.println("[Ctrl+Z] Nota desfeita.");
            System.out.println("Versão removida: " + removida.texto);
        }
    ```

6. `exibirHistorico()`

```java

    public static void exibirHistorico() {

        if (blocoDeNotas.isEmpty()) {
            System.out.println("Histórico vazio.");
            return;
        }

        System.out.println("\n=== HISTÓRICO DA PILHA ===");

        for (int i = blocoDeNotas.size() - 1; i >= 0; i--) {
            System.out.println(blocoDeNotas.get(i));
        } // percorre a pilha e exibe as notas dentro dela

        System.out.println("==========================\n");
    }
```

---

## Classe de execução `Main.java`
Nesta seção, apresenta-se os resultados do teste. Execute o arquivo: [Main.java](Main.java).

`output`  no terminal:
```
=== MEU BLOCO DE NOTAS ===

-> Nova nota criada com sucesso. 
Nota atual: [24/06 - Quarta] Fazer relátorio dessa atividade amanhã.
--------------------------------
-> Nova nota criada com sucesso.
Nota atual: [24/06 - Quarta] Jogar lixo
--------------------------------
-> Nota editada. Nova versão salva no topo
Nota atual: [24/06 - Quarta] Ir ao supermercado comprar café eaçúcar.
--------------------------------

=== HISTÓRICO DA PILHA ===
[24/06 - Quarta] Ir ao supermercado comprar café e açúcar.
[24/06 - Quarta] Jogar lixo
[24/06 - Quarta] Fazer relátorio dessa atividade amanhã.
==========================

Desfazendo última nota...

[Ctrl+Z] Nota desfeita.
Versão removida: Ir ao supermercado comprar café e açúcar.
Nota atual: [24/06 - Quarta] Jogar lixo
--------------------------------

=== HISTÓRICO DA PILHA ===
[24/06 - Quarta] Jogar lixo
[24/06 - Quarta] Fazer relátorio dessa atividade amanhã.
==========================
```


