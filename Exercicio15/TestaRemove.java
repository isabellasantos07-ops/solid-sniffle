import java.util.ArrayList;

public class TestaRemove {
    public static void main(String[] args) {
        ArrayList<Tarefa> lista = new ArrayList<>();
        lista.add(new Tarefa(1, "Tarefa A"));
        lista.add(new Tarefa(2, "Tarefa B"));
        lista.add(new Tarefa(3, "Tarefa C"));
        lista.add(new Tarefa(4, "Tarefa D"));

        System.out.println("Lista inicial:");
        for (Tarefa t : lista) {
            System.out.println(t.getId() + " - " + t.getDescricao());
        }

        // Remove por índice (posição 0)
        lista.remove(0);
        System.out.println("\nDepois de remove(0):");
        for (Tarefa t : lista) {
            System.out.println(t.getId() + " - " + t.getDescricao());
        }

        // Remove por objeto (usando equals, que compara o id)
        Tarefa tarefaExistente = new Tarefa(3, "qualquer");
        lista.remove(tarefaExistente);
        System.out.println("\nDepois de remove(objeto com id 3):");
        for (Tarefa t : lista) {
            System.out.println(t.getId() + " - " + t.getDescricao());
        }

        // Diferença:
        // remove(índice) → remove pela posição e retorna o objeto removido.
        // remove(objeto) → usa equals() para achar e remover, retorna true/false.
    }
}