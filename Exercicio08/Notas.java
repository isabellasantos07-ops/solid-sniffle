import java.util.ArrayList;
import java.util.List;

public class Notas {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        notas.add(5.5);
        notas.add(8.0);
        notas.add(6.5);
        notas.add(9.0);
        notas.add(4.0);
        notas.add(7.5);
        notas.add(3.5);
        notas.add(8.5);

        notas.removeIf(nota -> nota < 7.0);

        System.out.println("Notas aprovadas: " + notas);
        System.out.println("Total de aprovados: " + notas.size());
    }
}