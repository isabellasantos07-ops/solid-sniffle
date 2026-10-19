import java.util.ArrayList;

public class Itinerario {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();

        // 1. Adiciona 5 cidades
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Brasília");
        cidades.add("Salvador");

        // 2. Remove a segunda cidade (índice 1)
        cidades.remove(1);

        // 3. Substitui a terceira cidade atual por "Tóquio"
        // Depois de remover, os índices mudam. Agora a terceira é o índice 2
        cidades.set(2, "Tóquio");

        // 4. Mostra índice + nome
        for (int i = 0; i < cidades.size(); i++) {
            System.out.println("[" + i + "] - " + cidades.get(i));
        }
    }
}