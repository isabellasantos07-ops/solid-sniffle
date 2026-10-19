import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estatisticas {
    public static double calcularMedia(List<Double> valores) {
        double soma = 0;
        for (double valor : valores) { // Unboxing
            soma += valor;
        }
        return soma / valores.size();
    }

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.5);   // Autoboxing
        notas.add(8.0);
        notas.add(6.5);
        notas.add(9.0);
        notas.add(5.5);

        System.out.println("Maior nota: " + Collections.max(notas));
        System.out.println("Menor nota: " + Collections.min(notas));
        System.out.println("Média: " + calcularMedia(notas));
    }
}