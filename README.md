# Exemplo de Padrão Composite

Este projeto é um exemplo de aplicação do padrão de design **Composite** em Java. O padrão Composite permite que objetos sejam compostos em estruturas de árvore para representar hierarquias parte-todo. Com esse padrão, é possível tratar objetos individuais e composições de objetos de maneira uniforme.

## Estrutura do Código

O código é composto pelas seguintes classes:

1. **Tarefa**: Classe abstrata que define a interface para operações comuns em tarefas. Inclui métodos para adicionar, remover e exibir tarefas.

2. **TarefaSimples**: Implementa uma tarefa simples, que não pode adicionar ou remover outras tarefas. Apenas exibe seu nome.

3. **TarefaComposta**: Implementa uma tarefa composta que pode conter outras tarefas (simples ou compostas). Permite adicionar e remover tarefas e exibir a hierarquia de tarefas de forma recursiva.

4. **Main**: Classe principal que demonstra a utilização do padrão Composite. Cria tarefas simples e compostas, organiza-as em uma estrutura hierárquica e exibe a lista de tarefas.

## Como Utilizar

1. **Crie tarefas simples**:
   ```java
   Tarefa tarefa1 = new TarefaSimples("Comprar leite");
   Tarefa tarefa2 = new TarefaSimples("Ler um livro");
2. **Crie tarefas compostas e adicione tarefas simples a elas:**
   ```java
   TarefaComposta tarefaComposta = new TarefaComposta("Preparar para a viagem");
   tarefaComposta.adicionar(new TarefaSimples("Reservar hotel"));
   tarefaComposta.adicionar(new TarefaSimples("Comprar passagens"));
3. **Crie uma lista de tarefas e adicione tarefas simples e compostas:**
   ```java
   TarefaComposta listaDeTarefas = new TarefaComposta("Lista de Tarefas");
   listaDeTarefas.adicionar(tarefa1);
   listaDeTarefas.adicionar(tarefa2);
   listaDeTarefas.adicionar(tarefaComposta);
4. **Exiba a lista de tarefas:**
   ```java
   listaDeTarefas.exibir("");

##Exemplo de execução
```java
Lista de Tarefas:
  Tarefa: Comprar leite
  Tarefa: Ler um livro
Tarefa Composta: Preparar para a viagem
  Tarefa: Reservar hotel
  Tarefa: Comprar passagens


