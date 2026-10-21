import java.util.ArrayList;

public class TestaTarefa {
    public static void main(String[] args) {
        ArrayList<Tarefa> lista = new ArrayList<>();
        lista.add(new Tarefa(1, "Estudar Java"));
        lista.add(new Tarefa(2, "Fazer exercício"));   // índice 1
        lista.add(new Tarefa(3, "Revisar"));
        lista.add(new Tarefa(4, "Descansar"));
        lista.add(new Tarefa(2, "Fazer exercício de novo")); // mesmo id, índice 4

        Tarefa busca = new Tarefa(2, "Qualquer descrição");

        System.out.println("Primeira ocorrência (indexOf): " + lista.indexOf(busca));
        System.out.println("Última ocorrência (lastIndexOf): " + lista.lastIndexOf(busca));
    }
}