import java.util.ArrayList;
import java.util.Comparator;

public class TestaFilmeOrdenacao {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Matrix", 1999, 8.7));
        filmes.add(new Filme("Interestelar", 2014, 8.6));
        filmes.add(new Filme("Oppenheimer", 2023, 8.3));
        filmes.add(new Filme("Duna", 2021, 8.0));
        filmes.add(new Filme("Avatar", 2009, 7.9));

        // Ordena por título (alfabético)
        filmes.sort(Comparator.comparing(Filme::getTitulo));
        System.out.println("Ordenado por título:");
        for (Filme f : filmes) {
            System.out.println(f);
        }

        // Ordena por ano (crescente) com Lambda
        filmes.sort((f1, f2) -> Integer.compare(f1.getAno(), f2.getAno()));
        System.out.println("\nOrdenado por ano:");
        for (Filme f : filmes) {
            System.out.println(f);
        }
    }
}