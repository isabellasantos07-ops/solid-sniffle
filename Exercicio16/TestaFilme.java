import java.util.ArrayList;
import java.util.Collections;

public class TestaFilme {
    public static void main(String[] args) {
        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(new Filme("Matrix", 1999, 8.7));
        filmes.add(new Filme("Interestelar", 2014, 8.6));
        filmes.add(new Filme("Oppenheimer", 2023, 8.3));
        filmes.add(new Filme("Duna", 2021, 8.0));
        filmes.add(new Filme("Avatar", 2009, 7.9));

        Collections.sort(filmes);

        System.out.println("Filmes ordenados por nota (decrescente):");
        for (Filme f : filmes) {
            System.out.println(f);
        }
    }
}