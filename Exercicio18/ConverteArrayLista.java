import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConverteArrayLista {
    public static void main(String[] args) {
        // Array estático
        String[] marcasArray = {"Ford", "Toyota", "Honda"};

        // Converte para ArrayList editável
        List<String> listaMarcas = new ArrayList<>(Arrays.asList(marcasArray));

        // Adiciona mais duas marcas
        listaMarcas.add("Chevrolet");
        listaMarcas.add("Volkswagen");

        // Converte de volta para array
        String[] arrayFinal = listaMarcas.toArray(new String[0]);

        // Mostra o array final
        System.out.println("Array final:");
        for (String marca : arrayFinal) {
            System.out.println(marca);
        }
    }
}