import java.util.ArrayList;
import java.util.List;

abstract class Tarefa {
    abstract void adicionar(Tarefa tarefa);
    abstract void remover(Tarefa tarefa);
    abstract void exibir(String indentacao);
}

class TarefaSimples extends Tarefa {
    private String nome;

    public TarefaSimples(String nome) {
        this.nome = nome;
    }

    @Override
    void adicionar(Tarefa tarefa) {

    }

    @Override
    void remover(Tarefa tarefa) {

    }

    @Override
    void exibir(String indentacao) {
        System.out.println(indentacao + "Tarefa: " + nome);
    }
}

class TarefaComposta extends Tarefa {
    private String nome;
    private List<Tarefa> tarefas;

    public TarefaComposta(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    @Override
    void adicionar(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    void remover(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    @Override
    void exibir(String indentacao) {
        System.out.println(indentacao + "Tarefa Composta: " + nome);
        for (Tarefa tarefa : tarefas) {
            tarefa.exibir(indentacao + "  ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new TarefaSimples("Comprar leite");
        Tarefa tarefa2 = new TarefaSimples("Ler um livro");

        TarefaComposta tarefaComposta = new TarefaComposta("Preparar para a viagem");
        tarefaComposta.adicionar(new TarefaSimples("Reservar hotel"));
        tarefaComposta.adicionar(new TarefaSimples("Comprar passagens"));

        TarefaComposta listaDeTarefas = new TarefaComposta("Lista de Tarefas");
        listaDeTarefas.adicionar(tarefa1);
        listaDeTarefas.adicionar(tarefa2);
        listaDeTarefas.adicionar(tarefaComposta);

        listaDeTarefas.exibir("");
    }
}
