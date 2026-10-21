import java.util.ArrayList;
import java.util.List;

public class TestaSubList {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for (int i = 10; i <= 100; i += 10) {
            numeros.add(i);
        }

        System.out.println("Lista original: " + numeros);

        // Sublista dos índices 2 ao 6 (exclusivo)
        List<Integer> sub = numeros.subList(2, 6);

        // Modifica o primeiro elemento da sublista
        sub.set(0, 999);

        System.out.println("Lista original após modificação na sublista: " + numeros);

        // A alteração na sublista refletiu na lista original porque
        // subList retorna uma "visão" (view) da lista original, não uma cópia.
    }
}